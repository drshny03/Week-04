package com.tit.day01.generics.aidrivenresumescreeningsystem;

class ProductManager extends JobRole {
    public ProductManager(String candidateName) {
        super(candidateName);
    }

    @Override
    public String getRole() {
        return "Product Manager";
    }
}