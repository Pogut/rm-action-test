public class ReceiptPrinter {
    public String printReceipt(String customer, int subtotal, int discount) {
        int discountedSubtotal = subtotal - discount;
        int tax = (int) (discountedSubtotal * 0.08);
        int total = discountedSubtotal + tax;

        return "Customer: " + customer + "\n"
                + "Subtotal: " + subtotal + "\n"
                + "Discount: " + discount + "\n"
                + "Tax: " + tax + "\n"
                + "Total: " + total;
    }
}
