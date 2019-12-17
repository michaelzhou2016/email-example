//package ai.guiji.email.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.thymeleaf.dialect.IDialect;
//import org.thymeleaf.spring5.SpringTemplateEngine;
//import org.thymeleaf.spring5.dialect.SpringStandardDialect;
//import org.thymeleaf.templatemode.TemplateMode;
//import org.thymeleaf.templateresolver.StringTemplateResolver;
//
//import javax.swing.*;
//
///**
// * author: zhouliliang
// * Date: 2019/12/17 14:26
// * Description:
// */
//@Configuration
//public class TemplateConfig {
//
//    @Bean("springTemplateEngine")
//    public SpringTemplateEngine springTemplateEngine(){
//        SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
//        IDialect springStandardDialect = new SpringStandardDialect();
//        springTemplateEngine.setDialect(springStandardDialect);
//
//        StringTemplateResolver stringTemplateResolver = new StringTemplateResolver();
//        stringTemplateResolver.setCacheable(true);
//        stringTemplateResolver.setTemplateMode(TemplateMode.HTML);
//
//        springTemplateEngine.setTemplateResolver(stringTemplateResolver);
//
//        return springTemplateEngine;
//    }
//
//}
