public class CombinedRefactorings {
    private final double taxRate = 0.08;

    public String createInvoice(String customerName, int itemPrice, int quantity, int discountCents) {
        int subtotal = itemPrice * quantity;
        int discountedSubtotal = subtotal - discountCents;
        int tax = (int) (discountedSubtotal * taxRate);
        int total = discountedSubtotal + tax;

        String title = buildTitle(customerName);
        double dollars = centsToDollars(total);
        String status = formatStatus(total);

        return title + "\n"
                + "Subtotal: " + subtotal + "\n"
                + "Discount: " + discountCents + "\n"
                + "Tax: " + tax + "\n"
                + "Total: $" + dollars + "\n"
                + status;
    }

    private String buildTitle(String customerName) {
        return "Invoice for " + customerName.trim().toUpperCase();
    }

    private double centsToDollars(int cents) {
        return cents / 100.0;
    }

    private String formatStatus(int total) {
        if (total > 0) {
            return "Payment required";
        } else {
            return "No payment required";
        }
    }
}

class InvoiceFormatter {
}

class BillingPolicy {
}
