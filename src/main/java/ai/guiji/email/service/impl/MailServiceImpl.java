package ai.guiji.email.service.impl;

import ai.guiji.email.constant.EmailTypeEnum;
import ai.guiji.email.entity.BillingMailConfig;
import ai.guiji.email.mapper.BillingMailConfigMapper;
import ai.guiji.email.service.MailService;
import com.google.common.base.Splitter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.UrlResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.net.MalformedURLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 * author: zhouliliang
 * Date: 2019/12/16 18:16
 * Description:
 */
@Slf4j
@Service
public class MailServiceImpl implements MailService {

    private static final Splitter SPLITTER = Splitter.on(";").trimResults().omitEmptyStrings();

    private static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Value("${spring.mail.username}")
    private String from;
    @Value("${spring.mail.toadmin}")
    private String toTmp;

    @Autowired
    JavaMailSender mailSender;

    @Autowired
    private SpringTemplateEngine springTemplateEngine;

    @Autowired
    private BillingMailConfigMapper billingMailConfigMapper;

    @Override
    public void sendMailByRemind(String tel) {
        String[] to = toTmp.split(";"); //目标必须字符串或数组，多接收人时必须为数组，用字府串会报异常
        sendSimpleMail(from, to, "新用户注册提醒", new Date() + "注册手机号为：" + tel);
    }

    @Override
    public void sendSimpleMail(String from, String[] to, String title, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from); //腾讯的限制，发送人必须与发送邮箱相同，不同会报异常
        message.setTo(to);
        message.setSubject(title);
        message.setText(content);

        mailSender.send(message);
        System.out.println("send mail to: " + Arrays.toString(to) + "and content: " + content);
    }

    @Override
    public void sendImageMail(String to, String subject, String content, String imgPath, String imgId) throws MessagingException {
        //创建message
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        //发件人
        helper.setFrom(from);
        //收件人
        helper.setTo(to);
        //标题
        helper.setSubject(subject);
        //true指的是html邮件，false指的是普通文本
        helper.setText(content, true);
        //添加图片
        FileSystemResource file = new FileSystemResource(new File(imgPath));
        helper.addInline(imgId, file);
        //发送邮件
        mailSender.send(message);

    }

    @Override
    public void sendHtmlWithImageMail(String from, String[] to, String subject, String content, String imgId, String imgUrl) throws MessagingException, MalformedURLException, MailException {
        MimeMessage message = mailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(content, true);
        helper.setFrom(from);

        if (StringUtils.isNotBlank(imgId) && StringUtils.isNotBlank(imgUrl)) {
            helper.addInline(imgId, new UrlResource(imgUrl));
        }

        mailSender.send(message);
    }

    @Override
    public void sendHtmlMail(String from, String[] to, String subject, String content) throws MessagingException, MalformedURLException {
        sendHtmlWithImageMail(from, to, subject, content, null, null);
    }

    @Async
    @Override
    public void sendTemplateMail() {
        String[] to = toTmp.split(";"); //目标必须字符串或数组，多接收人时必须为数组，用字府串会报异常
        Context context = new Context();
        context.setVariable("customer", "zhouliliang");
        context.setVariable("operator", "zhouliliang");
        context.setVariable("amount", "100");
        context.setVariable("date", DATETIME_FORMATTER.format(LocalDateTime.now()));

        BillingMailConfig config = billingMailConfigMapper.selectByPrimaryKey(EmailTypeEnum.ONLINE_PAY_SUCCESS.getType());
        if (Objects.nonNull(config) && StringUtils.isNotBlank(config.getMailReceivers()) && StringUtils.isNotBlank(config.getMailContent())) {
            log.info("template:{}", config.getMailContent());

            String emailContent = springTemplateEngine.process(config.getMailContent(), context);

            try {
                this.sendHtmlMail(from, to, "BSS客户【在线充值】成功通知", emailContent);
            } catch (MessagingException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }

    @Async
    @Override
    public void sendPictureTemplateMail() {
        Context context = new Context();
        context.setVariable("customer", "zhouliliang");
        context.setVariable("operator", "zhouliliang");
        context.setVariable("amount", "100");
        context.setVariable("account_name", "zll");
        context.setVariable("account_number", "100100");
        context.setVariable("date", DATETIME_FORMATTER.format(LocalDateTime.now()));

//        String emailContent = templateEngine.process("pictureEmailTemplate", context);
//        String template = "<!DOCTYPE html>\n" +
//                "<html lang=\"en\" xmlns:th=\"http://www.thymeleaf.org\">\n" +
//                "<head>\n" +
//                "    <meta charset=\"UTF-8\"/>\n" +
//                "    <title>BSS客户【线下汇款】申请</title>\n" +
//                "</head>\n" +
//                "<body>\n" +
//                "<p>客户：<span th:text=\"${customer}\"></span></p>\n" +
//                "<p>操作人：<span th:text=\"${operator}\"></span></p>\n" +
//                "<p>支付方式：线下汇款-银行转账</p>\n" +
//                "<p>打款金额：<span th:text=\"${amount}\"></span>元</p>\n" +
//                "<p>付款账户名称：<span th:text=\"${account_name}\"></span></p>\n" +
//                "<p>付款账号：<span th:text=\"${account_number}\"></span></p>\n" +
//                "<p>支付截图：<img src=\"cid:snap_url\"/></p>\n" +
//                "<p>操作时间：<span th:text=\"${date}\"></span></p>\n" +
//                "</body>\n" +
//                "</html>";
        BillingMailConfig config = billingMailConfigMapper.selectByPrimaryKey(EmailTypeEnum.OFFLINE_PAY_APPLY.getType());
        if (Objects.nonNull(config) && StringUtils.isNotBlank(config.getMailReceivers()) && StringUtils.isNotBlank(config.getMailContent())) {
            log.info("template:{}, receivers:{}", config.getMailContent(), config.getMailReceivers());
            String emailContent = springTemplateEngine.process(config.getMailContent(), context);
            String[] to = SPLITTER.splitToList(config.getMailReceivers()).toArray(new String[0]); //目标必须字符串或数组，多接收人时必须为数组，用字府串会报异常
            try {
                this.sendHtmlWithImageMail(from, to, "BSS客户【线下汇款】申请", emailContent, "snap_url", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1576508932107&di=6f8dd77ea79ce49f23090f011ebe49c5&imgtype=0&src=http%3A%2F%2Ffile02.16sucai.com%2Fd%2Ffile%2F2014%2F0704%2Fe53c868ee9e8e7b28c424b56afe2066d.jpg");
            } catch (MessagingException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }
}
