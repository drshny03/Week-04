package com.tit.day01.generics.universitycoursemanagementsystem;

import java.util.List;

// Generic Course class with bounded type parameter
class Course<T extends CourseType> {
    private String courseCode;
    private T courseType;

    public Course(String courseCode, T courseType) {
        this.courseCode = courseCode;
        this.courseType = courseType;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public T getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return "[" + courseCode + "] " + courseType;
    }


    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
}