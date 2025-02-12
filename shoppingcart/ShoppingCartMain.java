package com.tit.day02.shoppingcart;

public class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart("Laptop", 50000.00);
        cart.addToCart("Mouse", 500.00);
        cart.addToCart("Phone", 30000.00);
        cart.addToCart("Headphones", 2500.00);

        cart.displayCart();
        cart.displaySortedByPrice();
    }
}
