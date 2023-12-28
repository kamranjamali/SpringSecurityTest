package com.security.SpringSecurityTest.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class AppConfig {


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }

    //    @Bean
//    public UserDetailsService getUserDetailsService() {
//
//        UserDetails user = User.builder()
//                .username("kamran")
//                .password(passwordEncoder().encode("kamran"))
//                .roles("USER")
//                .build();
//        UserDetails admin = User.builder()
//                .username("sarmad")
//                .password(passwordEncoder().encode("sarmad"))
//                .roles("USER", "ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(user, admin);


//    }

}
