package com.bankaccount.demo.configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String[] AUTH_WHITELIST = {
            "/h2-console/**",
            "/swagger-ui.html"
    };

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers(AUTH_WHITELIST).permitAll();
        http.headers().frameOptions().disable();

    }



}
