package com.tit.day01.generics.warehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
    public static void displayItems(List<? extends WarehouseItem> items)
    {
        for (WarehouseItem item : items)
        {
            System.out.println(item);
        }
    }
}

