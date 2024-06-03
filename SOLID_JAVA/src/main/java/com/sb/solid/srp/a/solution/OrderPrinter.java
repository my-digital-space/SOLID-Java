package com.sb.solid.srp.a.solution;

import com.sb.solid.srp.a.issue.Item;

public class OrderPrinter {

    private Order order;

    public OrderPrinter(Order order) {
        this.order = order;
    }

    public void printOrder() {
        System.out.println("Order ID: " + order.getId());
        for (Item item : order.getItems()) {
            System.out.println(item);
        }
        System.out.println("Total: $" + new OrderCalculator(order.getItems()).calculateTotal());
    }
}
