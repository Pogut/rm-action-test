package shop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final CustomerProfile customer;
    private final List<OrderLine> lines = new ArrayList<>();

    public Order(CustomerProfile customer) {
        this.customer = customer;
    }

    public void add(OrderLine line) {
        lines.add(line);
    }

    public List<OrderLine> getLines() {
        return lines;
    }

    public CustomerProfile getCustomer() {
        return customer;
    }

    public double total() {
        double subtotal = computeSubtotal();
        double taxable = subtotal - computeDiscount(subtotal);
        return taxable + computeTax(taxable);
    }

    private double computeSubtotal() {
        double subtotal = 0;
        for (OrderLine line : lines) {
            subtotal += line.getUnitPrice() * line.getQuantity();
        }
        return subtotal;
    }

    private double computeDiscount(double subtotal) {
        double discount = subtotal * customer.getAccount().discountRate();
        if (subtotal > 500) {
            discount += 25;
        }
        return discount;
    }

    private double computeTax(double taxable) {
        double tax = taxable * 0.15;
        if (customer.getAddress().isIn("Montreal")) {
            tax = taxable * 0.14975;
        }
        return tax;
    }
}
