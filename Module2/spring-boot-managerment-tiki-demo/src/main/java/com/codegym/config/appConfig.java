package com.codegym.config;

        import org.springframework.context.MessageSource;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class appConfig {
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("erros_messange");
        return messageSource;
    }
}
