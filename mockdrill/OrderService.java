package mockdrill;

import java.util.*;

class Order {
    String orderId;
    String customer;
    int amount;
    String status;

    Order(String orderId, String customer, int amount, String status) {
        this.orderId = orderId;
        this.customer = customer;
        this.amount = amount;
        this.status = status;
    }
}

public class OrderService {
    private List<Order> orders;

    public OrderService(List<Order> orders) {
        this.orders = orders;
    }

    public int getCompleteOrderTotal(String customer) {
        int total = 0;
        for (Order i : orders) {
            if (customer.equals(i.customer) && "COMPLETED".equals(i.status)) {
                total += i.amount;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>(List.of(
                new Order("O1", "Amit", 500, "COMPLETED"),
                new Order("O2", "Ravi", 300, "COMPLETED"),
                new Order("O3", "Amit", 200, "PENDING"),
                new Order("O4", "Amit", 700, "COMPLETED")));
        String customer = "Amit";
        OrderService solver = new OrderService(orders);
        System.out.println(solver.getCompleteOrderTotal(customer));
    }
}