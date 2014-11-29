package com.annotation.myAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-20
 * Time: 23:02:39
 * To change this template use File | Settings | File Templates.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation
{
    String val() default "lin";

    String _val();

}
