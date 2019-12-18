package ai.guiji.email.service;

import org.springframework.mail.MailException;

import javax.mail.MessagingException;
import java.net.MalformedURLException;

public interface MailService {

    void sendMailByRemind(String tel);

    void sendSimpleMail(String from, String[] to, String title, String content);

    void sendImageMail(String to, String subject, String content, String imgPath, String imgId) throws MessagingException;

    void sendHtmlWithImageMail(String from, String[] to, String subject, String content, String imgId, String imgUrl) throws MessagingException, MailException, MalformedURLException;

    void sendHtmlMail(String from, String[] to, String subject, String content) throws MessagingException, MalformedURLException;

    void sendTemplateMail();

    void sendPictureTemplateMail();

    void testTemplateResolver();

    void sendTemplateMailV2();
}
