public interface PaymentProcessor {
    boolean charge(String accountId, int amount);
}

class CreditCardProcessor implements PaymentProcessor {
    public boolean charge(String accountId, int amount) {
        System.out.println("Charging " + accountId + " for " + amount);
        return amount > 0;
    }
}

class PaymentController {
    private final PaymentProcessor processor;

    public PaymentController(PaymentProcessor processor) {
        this.processor = processor;
    }

    public boolean submit(String accountId, int amount) {
        return processor.charge(accountId, amount);
    }
}
