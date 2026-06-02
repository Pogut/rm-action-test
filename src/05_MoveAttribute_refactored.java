public class CheckoutService {
    public int totalWithTax(int subtotal) {
        TaxPolicy policy = new TaxPolicy();
        return (int) (subtotal + subtotal * policy.taxRate);
    }
}

class TaxPolicy {
    public final double taxRate = 0.08;
}
