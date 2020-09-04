package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {

    private String coursePrefix;
    @Override
    public void initialize(CourseCode constraintAnnotation) {
        coursePrefix= constraintAnnotation.value();

    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = theCode.startsWith(coursePrefix);
        return result;
    }
}
