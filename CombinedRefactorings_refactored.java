public class CombinedRefactorings {
    private final InvoiceFormatter formatter = new InvoiceFormatter();

    public String createInvoice(String customerName, int itemPrice, int quantity, int discountCents) {
        int total = calculateTotal(itemPrice, quantity, discountCents);
        int subtotal = itemPrice * quantity;
        int discountedSubtotal = subtotal - discountCents;
        int tax = (int) (discountedSubtotal * new BillingPolicy().taxRate);

        String title = formatter.formatTitle(customerName);
        double dollars = total / 100.0;
        String status = paymentStatus(total);

        return title + "\n"
                + "Subtotal: " + subtotal + "\n"
                + "Discount: " + discountCents + "\n"
                + "Tax: " + tax + "\n"
                + "Total: $" + dollars + "\n"
                + status;
    }

    private int calculateTotal(int itemPrice, int quantity, int discountCents) {
        int subtotal = itemPrice * quantity;
        int discountedSubtotal = subtotal - discountCents;
        int tax = (int) (discountedSubtotal * new BillingPolicy().taxRate);
        return discountedSubtotal + tax;
    }

    private String paymentStatus(int total) {
        if (total <= 0) {
            return "No payment required";
        } else {
            return "Payment required";
        }
    }
}

class InvoiceFormatter {
    public String formatTitle(String customerName) {
        return "Invoice for " + customerName.trim().toUpperCase();
    }
}

class BillingPolicy {
    public final double taxRate = 0.08;
}
