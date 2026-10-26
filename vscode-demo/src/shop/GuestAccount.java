package shop;

public class GuestAccount extends Account {
    public GuestAccount(String id, String name) {
        super(id, name);
    }

    @Override
    public double discountRate() {
        return 0.0;
    }

    public String displayName() {
        if (name == null || name.isBlank()) {
            return "Customer " + id;
        }
        return name.trim();
    }
}
