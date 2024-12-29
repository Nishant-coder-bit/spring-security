package com.example.spring_security.config;

import com.example.spring_security.filter.LoggingFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.net.http.HttpRequest;

@Configuration
@EnableWebSecurity

public class WebSecurityConfig {

    public final LoggingFilter loggingFilter;

    public WebSecurityConfig(LoggingFilter loggingFilter) {
        this.loggingFilter = loggingFilter;
    }


    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity,HttpRequest httpRequest) throws Exception{
           return httpSecurity.addFilterBefore(loggingFilter, UsernamePasswordAuthenticationFilter.class).build();

    }
}
