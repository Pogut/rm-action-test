package shop;

public class OrderLine {
    private final String product;
    private final double unitPrice;
    private final int quantity;

    public OrderLine(String product, double unitPrice, int quantity) {
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }
}
