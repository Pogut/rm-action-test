package shop;

public class GuestAccount extends Account {
    public GuestAccount(String id, String name) {
        super(id, name);
    }

    @Override
    public double discountRate() {
        return 0.0;
    }
}
