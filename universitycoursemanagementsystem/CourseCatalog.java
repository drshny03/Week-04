package com.tit.day01.generics.universitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Course Catalog to manage different types of courses
class CourseCatalog<T extends CourseType> {
    private List<Course<T>> courses = new ArrayList<>();

    public void addCourse(Course<T> course) {
        courses.add(course);
    }

    public List<Course<T>> getCourses() {
        return courses;
    }
}
