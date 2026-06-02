public class CheckoutService {
    private final double taxRate = 0.08;

    public int totalWithTax(int subtotal) {
        TaxPolicy policy = new TaxPolicy();
        return (int) (subtotal + subtotal * taxRate);
    }
}

class TaxPolicy {
}
