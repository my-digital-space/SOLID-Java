package com.sb.solid.srp.a.solution;

import com.sb.solid.srp.a.issue.Item;

import java.util.List;

public class Order {

    private int id;
    private List<Item> items;

    public Order(int id, List<Item> items) {
        this.id = id;
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getTotal() {
        return new OrderCalculator(items).calculateTotal();
    }

    public List<Item> getItems() {
        return items;
    }

    public int getId() {
        return id;
    }

}

