public class CurrencyDisplay {
    public String formatPrice(int cents) {
        double dollars = centsToDollars(cents);
        return "$" + dollars;
    }

    private double centsToDollars(int cents) {
        return cents / 100.0;
    }
}
