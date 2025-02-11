package com.tit.day01.generics.onlinemarketplace;

import static com.tit.day01.generics.onlinemarketplace.Product.applyDiscount;

public class OnlineMarketplaceMain {


    public static void main(String[] args) {
        Product<BookCategory> book1 = new Product<>("Harry Potter", 250, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Jeans", 1999, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 50000, new GadgetCategory());

        ProductCatalog<BookCategory> bookCatalog = new ProductCatalog<>();
        bookCatalog.addProduct(book1);

        ProductCatalog<ClothingCategory> clothingCatalog = new ProductCatalog<>();
        clothingCatalog.addProduct(shirt);

        ProductCatalog<GadgetCategory> gadgetCatalog = new ProductCatalog<>();
        gadgetCatalog.addProduct(phone);

        // Apply discounts
        applyDiscount(book1, 10);
        applyDiscount(shirt, 15);
        applyDiscount(phone, 5);

        // Display products after discount
        System.out.println("Book Catalog:");
        bookCatalog.getProducts().forEach(System.out::println);

        System.out.println("\nClothing Catalog:");
        clothingCatalog.getProducts().forEach(System.out::println);

        System.out.println("\nGadget Catalog:");
        gadgetCatalog.getProducts().forEach(System.out::println);
    }
}
