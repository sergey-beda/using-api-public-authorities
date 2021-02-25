package ru.config.security;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Getter
@Slf4j
public class BaseSecurityConfig extends WebSecurityConfigurerAdapter {

    String login;
    String password;

    @Override
    public void configure(HttpSecurity http) {
        try{
            http
                    .csrf().disable()
                    .authorizeRequests()
                    .antMatchers("/api/**").hasRole("USER")
                    .antMatchers("/**").permitAll()
                    .and().httpBasic();
        } catch (Exception e) {
            log.error("Ошибка конфигурации HttpSecurity");
        }
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) {
        try {
            auth.inMemoryAuthentication()
                    .withUser(getLogin()).password("{noop}"+getPassword()).roles("USER");
        } catch (Exception e) {
            log.info("ошибка конфигурации AuthenticationManagerBuilder");
        }
    }
}
