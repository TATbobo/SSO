package com.tucker.sso.ssoclient1.TestAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {

    @Bean(name = "ConfigurationHello")
    public String ConfigurationHello(){
        return "hello ,Configuration Bean";
    }
}
