package com.tit.day01.generics.aidrivenresumescreeningsystem;

import java.util.List;

import static com.tit.day01.generics.aidrivenresumescreeningsystem.ResumeScreening.processResumes;

public class AIResumeScreeningSystemMain
{

    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Darshan"), "Java, Spring Boot, Microservices");
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Rajveer"), "Python, Machine Learning, AI");
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Ankit"), "Product Strategy, Agile, Roadmap Planning");

        ResumeScreening<SoftwareEngineer> seScreening = new ResumeScreening<>();
        seScreening.addResume(seResume);

        ResumeScreening<DataScientist> dsScreening = new ResumeScreening<>();
        dsScreening.addResume(dsResume);

        ResumeScreening<ProductManager> pmScreening = new ResumeScreening<>();
        pmScreening.addResume(pmResume);

        // Process all resumes dynamically
        List<JobRole> jobRoles = List.of(
                new SoftwareEngineer("Alice"),
                new DataScientist("Bob"),
                new ProductManager("Charlie")
        );

        processResumes(jobRoles);
    }
}
