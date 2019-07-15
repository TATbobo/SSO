package com.tucker.sso.ssoclient1.TestAnnotation;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        Map<String , Object> attributes = annotatedTypeMetadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());

        String propertyKey = String.valueOf(attributes.get("key"));

        String propertyValue = String.valueOf(attributes.get("value"));

        String sysPropertyValue  = System.getProperty(propertyKey);

        return propertyValue.equals(sysPropertyValue);


    }
}
