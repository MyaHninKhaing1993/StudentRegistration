/*
 * $Header$
 * $Revision$
 * $Date$
 */
package com.example.demo1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 概略
 * <p>概要・説明</p>
 * 
 * @author $Author$
 * @version $Revision$ $Date$
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CustomAnnotation {
    public String name() default "Potato";
    
}