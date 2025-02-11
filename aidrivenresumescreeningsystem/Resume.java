package com.tit.day01.generics.aidrivenresumescreeningsystem;

// Generic Resume Class
class Resume<T extends JobRole> {
    private T jobRole;
    private String resumeContent;

    public Resume(T jobRole, String resumeContent) {
        this.jobRole = jobRole;
        this.resumeContent = resumeContent;
    }

    public T getJobRole() {
        return jobRole;
    }

    public String getResumeContent() {
        return resumeContent;
    }

    @Override
    public String toString() {
        return "Candidate: " + jobRole.getCandidateName() +
                " | Role: " + jobRole.getRole() +
                " | Resume: " + resumeContent;
    }
}