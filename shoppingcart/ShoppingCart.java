package com.tit.day02.shoppingcart;

import java.util.*;

public class ShoppingCart {
    private LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

    public void addToCart(String product, double price) {
        cart.put(product, price);
    }

    public void displayCart() {
        System.out.println("Cart: " + cart);
    }

    public void displaySortedByPrice() {
        List<Map.Entry<String, Double>> list = new ArrayList<>(cart.entrySet());
        list.sort(Map.Entry.comparingByValue());

        System.out.println("Cart (Sorted by Price):");
        for (Map.Entry<String, Double> entry : list) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
