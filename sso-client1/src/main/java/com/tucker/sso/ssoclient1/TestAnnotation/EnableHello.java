package com.tucker.sso.ssoclient1.TestAnnotation;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(HelloConfiguration.class)
public @interface EnableHello {
}
