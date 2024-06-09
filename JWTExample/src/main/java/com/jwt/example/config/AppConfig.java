package com.jwt.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.security.cert.Extension;

@Configuration
public class AppConfig {

    @Bean
    public UserDetailsService userDetailsService(){
       UserDetails user= User.builder().username("harsh").password(passwordEncoder().encode("abc")).roles("admin").build();
        UserDetails user1= User.builder().username("durgesh").password(passwordEncoder().encode("abc")).roles("admin").build();
    return new InMemoryUserDetailsManager(user, user1);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
