public class CurrencyDisplay {
    public String formatPrice(int cents) {
        double dollars = cents / 100.0;
        return "$" + dollars;
    }
}
