package com.tit.day01.generics.aidrivenresumescreeningsystem;

class DataScientist extends JobRole {
    public DataScientist(String candidateName) {
        super(candidateName);
    }

    @Override
    public String getRole() {
        return "Data Scientist";
    }
}