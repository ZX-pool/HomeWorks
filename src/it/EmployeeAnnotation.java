package it;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface EmployeeAnnotation {
    String parameter() default "default parameter";
}
