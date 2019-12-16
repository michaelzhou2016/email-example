package ai.guiji.email.runner;

import ai.guiji.email.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * author: zhouliliang
 * Date: 2019/12/16 18:49
 * Description:
 */
@Component
public class MyRunner implements ApplicationRunner {
    @Autowired
    private MailService mailService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        mailService.sendMailByRemind("18936918059");
        mailService.sendPictureTemplateMail();
    }
}
