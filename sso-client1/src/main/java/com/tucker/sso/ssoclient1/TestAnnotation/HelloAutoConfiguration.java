package com.tucker.sso.ssoclient1.TestAnnotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHello
@ConditionalOnSystemProperty(key = "user.name" , value = "tucker")
public class HelloAutoConfiguration {

    @Bean(name = "AutoHello")
    public String AutoHello(){
        return "hello ,AutoBean";
    }
}
