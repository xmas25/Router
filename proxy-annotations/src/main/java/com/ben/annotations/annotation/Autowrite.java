package com.ben.annotations.annotation;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author @zhangchuan622@gmail.com
 * @version 1.0
 * @create 2017-08-02
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface Autowrite {
    String name() default "";
}
