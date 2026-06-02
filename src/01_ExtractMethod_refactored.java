public class ReceiptPrinter {
    public String printReceipt(String customer, int subtotal, int discount) {
        int total = calculateTotal(subtotal, discount);

        return "Customer: " + customer + "\n"
                + "Subtotal: " + subtotal + "\n"
                + "Discount: " + discount + "\n"
                + "Total: " + total;
    }

    private int calculateTotal(int subtotal, int discount) {
        int discountedSubtotal = subtotal - discount;
        int tax = (int) (discountedSubtotal * 0.08);
        return discountedSubtotal + tax;
    }
}
