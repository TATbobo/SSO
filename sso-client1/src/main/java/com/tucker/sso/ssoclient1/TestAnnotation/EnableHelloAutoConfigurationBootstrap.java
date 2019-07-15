package com.tucker.sso.ssoclient1.TestAnnotation;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
public class EnableHelloAutoConfigurationBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloAutoConfigurationBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloBean = context.getBean("AutoHello" ,String.class);
        System.out.println("hello Bean: " + helloBean);
        String sayHelloBean = context.getBean("ConfigurationHello", String.class);
        System.out.println("sayHello Bean: " + sayHelloBean);
        context.close();
    }
}
