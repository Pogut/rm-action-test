package payments;

public class PaymentService {
    private static final double MINIMUM_FEE = 0.30;

    private final double percentageFee;

    public PaymentService(double percentageFee) {
        this.percentageFee = percentageFee;
    }

    public double charge(String cardNumber, double amount) {
        validateCard(cardNumber);
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        double total = amount + feeFor(amount);
        System.out.println("Charging " + total);
        return total;
    }

    public double refund(String cardNumber, double amount) {
        validateCard(cardNumber);
        System.out.println("Refunding " + amount);
        return -amount;
    }

    private double feeFor(double amount) {
        return Math.max(amount * percentageFee, MINIMUM_FEE);
    }

    private void validateCard(String cardNumber) {
        if (cardNumber == null || cardNumber.length() < 12) {
            throw new IllegalArgumentException("Invalid card");
        }
    }
}
