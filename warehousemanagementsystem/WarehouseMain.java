package com.tit.day01.generics.warehousemanagementsystem;

import static com.tit.day01.generics.warehousemanagementsystem.Storage.displayItems;

public class WarehouseMain
{

    public static void main(String[] args)
    {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Oats"));
        groceriesStorage.addItem(new Groceries("Rice"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Table"));
        furnitureStorage.addItem(new Furniture("Chair"));

        // Display all items using wildcard method
        System.out.println("Electronics:");
        displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture:");
        displayItems(furnitureStorage.getItems());
    }
}




