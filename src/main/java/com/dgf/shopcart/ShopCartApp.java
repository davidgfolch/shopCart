package com.dgf.shopcart;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.session.config.annotation.web.server.EnableSpringWebSession;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.reactive.config.EnableWebFlux;

@Configuration
@SpringBootApplication
@EnableSpringWebSession
@EnableWebFlux
@EnableWebFluxSecurity()
@Slf4j
public class ShopCartApp {

    public static void main(String[] args) {
        SpringApplication.run(ShopCartApp.class);
    }

    @Bean
    @Primary
    public Validator springValidator() {
        return new LocalValidatorFactoryBean();
    }

}
