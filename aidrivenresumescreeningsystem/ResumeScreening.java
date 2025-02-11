package com.tit.day01.generics.aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

// Resume Screening System
class ResumeScreening<T extends JobRole> {
    private List<Resume<T>> resumeList = new ArrayList<>();

    public void addResume(Resume<T> resume) {
        resumeList.add(resume);
    }

    public List<Resume<T>> getResumes() {
        return resumeList;
    }
    public static void processResumes(List<? extends JobRole> jobRoles) {
        System.out.println("Processing Resumes...");
        for (JobRole jobRole : jobRoles) {
            System.out.println("Screening: " + jobRole.getCandidateName() + " for " + jobRole.getRole());
        }
    }
}