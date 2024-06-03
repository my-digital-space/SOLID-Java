package com.sb.solid.srp.a.solution;

import com.sb.solid.srp.a.issue.Item;

import java.util.List;

public class OrderCalculator {

    private List<Item> items;

    public OrderCalculator(List<Item> items) {
        this.items = items;
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
