package com.tit.day01.generics.aidrivenresumescreeningsystem;

// Specific Job Roles
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    @Override
    public String getRole() {
        return "Software Engineer";
    }
}
