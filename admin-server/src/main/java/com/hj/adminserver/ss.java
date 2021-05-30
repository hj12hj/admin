package com.hj.adminserver;


import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface ss {

    @AliasFor(annotation = Component.class,attribute = "value")
    String value() default "eeeee";
    String value1() default "eeeee1";
    String value2() default "eeeee2";
}
