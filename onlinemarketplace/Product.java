package com.tit.day01.generics.onlinemarketplace;

class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price -= price * (percentage / 100);
        }
    }

    @Override
    public String toString() {
        return name + " (" + category.getName() + ") - INR " + price;
    }

    public static <T extends Product<?>> void applyDiscount(T product, double percentage)
    {
        product.applyDiscount(percentage);
    }


}