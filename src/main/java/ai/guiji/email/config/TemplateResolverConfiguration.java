package ai.guiji.email.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.templateresolver.StringTemplateResolver;

/**
 * author: zhouliliang
 * Date: 2019/12/17 14:54
 * Description:
 */
@Configuration
public class TemplateResolverConfiguration {

    @Bean
    public StringTemplateResolver defaultTemplateResolver() {
        StringTemplateResolver resolver = new StringTemplateResolver();
        return resolver;
    }
}
