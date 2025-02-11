package com.tit.day01.generics.onlinemarketplace;

abstract class ProductCategory {
    private String name;

    public ProductCategory(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
