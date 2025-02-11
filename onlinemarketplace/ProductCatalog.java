package com.tit.day01.generics.onlinemarketplace;

import java.util.ArrayList;
import java.util.List;

class ProductCatalog<T extends ProductCategory> {
    private List<Product<T>> products = new ArrayList<>();

    public void addProduct(Product<T> product) {
        products.add(product);
    }

    public List<Product<T>> getProducts() {
        return products;
    }
}