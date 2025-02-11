package com.tit.day01.generics.universitycoursemanagementsystem;


// Main class to test the implementation
public class UniversityCourseMain {
    public static void main(String[] args) {
        Course<ExamCourse> mathExam = new Course<>("M01", new ExamCourse("Mathematics"));
        Course<AssignmentCourse> javaAssignment = new Course<>("CS102", new AssignmentCourse("Java Programming"));
        Course<ResearchCourse> aiResearch = new Course<>("AI303", new ResearchCourse("Artificial Intelligence"));

        CourseCatalog<ExamCourse> examCatalog = new CourseCatalog<>();
        examCatalog.addCourse(mathExam);

        CourseCatalog<AssignmentCourse> assignmentCatalog = new CourseCatalog<>();
        assignmentCatalog.addCourse(javaAssignment);

        CourseCatalog<ResearchCourse> researchCatalog = new CourseCatalog<>();
        researchCatalog.addCourse(aiResearch);

        // Display courses
        System.out.println("Exam-Based Courses:");
        examCatalog.getCourses().forEach(System.out::println);

        System.out.println("\nAssignment-Based Courses:");
        assignmentCatalog.getCourses().forEach(System.out::println);

        System.out.println("\nResearch-Based Courses:");
        researchCatalog.getCourses().forEach(System.out::println);
    }
}