public class RefactoringShowcase {
    private final StatementFormatter formatter = new StatementFormatter();

    public String createStatement(String customerName, int unitPrice, int quantity, int discount) {
        int total = calculateTotal(unitPrice, quantity, discount);
        int subtotal = unitPrice * quantity;
        int discountedSubtotal = subtotal - discount;
        int tax = (int) (discountedSubtotal * new TaxRules().taxRate);

        String header = formatter.buildHeader(customerName);
        double dollars = total / 100.0;
        String status = describePaymentStatus(total);

        return header + "\n"
                + "Subtotal: " + subtotal + "\n"
                + "Discount: " + discount + "\n"
                + "Tax: " + tax + "\n"
                + "Total: $" + dollars + "\n"
                + status;
    }

    private int calculateTotal(int unitPrice, int quantity, int discount) {
        int subtotal = unitPrice * quantity;
        int discountedSubtotal = subtotal - discount;
        int tax = (int) (discountedSubtotal * new TaxRules().taxRate);
        return discountedSubtotal + tax;
    }

    private String describePaymentStatus(int total) {
        if (total > 0) {
            return "Payment required";
        }
        return "No payment required";
    }
}

class StatementFormatter {
    public String buildHeader(String customerName) {
        return "Statement for " + customerName.trim().toUpperCase();
    }
}

// testing

class TaxRules {
    public final double taxRate = 0.08;
}
