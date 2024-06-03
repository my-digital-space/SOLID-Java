package com.sb.solid.srp.a.issue;

import java.util.List;

public class Order {

    private int id;
    private List<Item> items;
    private double total;

    public Order(int id, List<Item> items) {
        this.id = id;
        this.items = items;
        calculateTotal(); // Calculates total based on items
    }

    public void addItem(Item item) {
        items.add(item);
        calculateTotal(); // Recalculates total after adding item
    }

    public double getTotal() {
        return total;
    }

    private void calculateTotal() {
        total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
    }

    public void printOrder() { // Prints order details including total
        System.out.println("Order ID: " + id);
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("Total: $" + total);
    }
}
