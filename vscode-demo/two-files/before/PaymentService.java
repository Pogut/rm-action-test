package payments;

public class PaymentService {
    private final double feeRate;

    public PaymentService(double feeRate) {
        this.feeRate = feeRate;
    }

    public double charge(String cardNumber, double amount) {
        if (cardNumber == null || cardNumber.length() < 12) {
            throw new IllegalArgumentException("Invalid card");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        double fee = amount * feeRate;
        if (fee < 0.30) {
            fee = 0.30;
        }
        System.out.println("Charging " + (amount + fee));
        return amount + fee;
    }

    public double doRefund(String cardNumber, double amount) {
        if (cardNumber == null || cardNumber.length() < 12) {
            throw new IllegalArgumentException("Invalid card");
        }
        System.out.println("Refunding " + amount);
        return -amount;
    }
}
