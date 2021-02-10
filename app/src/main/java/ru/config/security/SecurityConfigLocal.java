package ru.config.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@ConditionalOnWebApplication
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
@Profile("local")
@PropertySource("classpath:application-local.properties")
public class SecurityConfigLocal extends BaseSecurityConfig {

    @Value("${spring.security.user.name}")
    String login;

    @Value("${spring.security.user.password}")
    String password;

    @Override
    public String getLogin() {return login;}

    @Override
    public String getPassword() {return password;}
}
