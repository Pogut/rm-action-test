public class CreditCardProcessor {
    public boolean charge(String accountId, int amount) {
        System.out.println("Charging " + accountId + " for " + amount);
        return amount > 0;
    }
}

class PaymentController {
    private final CreditCardProcessor processor;

    public PaymentController(CreditCardProcessor processor) {
        this.processor = processor;
    }

    public boolean submit(String accountId, int amount) {
        return processor.charge(accountId, amount);
    }
}
