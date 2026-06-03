public class RefactoringShowcase {
    private final double taxRate = 0.08;

    public String createStatement(String customerName, int unitPrice, int quantity, int discount) {
        int subtotal = unitPrice * quantity;
        int discountedSubtotal = subtotal - discount;
        int tax = (int) (discountedSubtotal * taxRate);
        int total = discountedSubtotal + tax;

        String header = buildHeader(customerName);
        double dollars = centsToDollars(total);
        String status = formatPaymentStatus(total);

        return header + "\n"
                + "Subtotal: " + subtotal + "\n"
                + "Discount: " + discount + "\n"
                + "Tax: " + tax + "\n"
                + "Total: $" + dollars + "\n"
                + status;
    }

    private String buildHeader(String customerName) {
        return "Statement for " + customerName.trim().toUpperCase();
    }

    private double centsToDollars(int cents) {
        return cents / 100.0;
    }

    private String formatPaymentStatus(int total) {
        if (total > 0) {
            return "Payment required";
        }
        return "No payment required";
    }
}

class StatementFormatter {
}
// test
class TaxRules {
}
