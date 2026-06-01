public class Calculator {
    public int processOrder(int price, int quantity, double taxRate) {
        int subtotal = price * quantity;
        double tax = subtotal * taxRate;
        int total = (int)(subtotal + tax);
        System.out.println("Order total: " + total);
        return total;
    }
}
