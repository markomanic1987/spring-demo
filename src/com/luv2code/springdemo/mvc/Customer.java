package com.luv2code.springdemo.mvc;

import com.luv2code.springdemo.mvc.validation.CourseCode;

import javax.validation.Valid;

import javax.validation.constraints.*;

public class Customer {
    @Size(min=1,message = "is required")
    @NotNull(message = "is required")
    private String firstName;

    @NotEmpty(message = "Last name shouldnt be empty")
    @Size(min=1,message = "is required")
    @NotNull(message = "is required")
    private String lastName;
    @Min(value = 0,message = "Must be greater than or equal 0")
    @Max(value = 10,message = "must be equal or lower then 10")
    private int freePasses;
    @CourseCode
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }
}
