package shop;

public class MemberAccount extends Account {
    private int points;

    public MemberAccount(String id, String name) {
        super(id, name);
    }

    @Override
    public double discountRate() {
        return 0.10;
    }

    public void addPoints(double orderTotal) {
        int earned = (int) Math.floor(orderTotal / 10);
        if (earned > 50) {
            earned = 50;
        }
        points += earned;
    }

    public String tier() {
        if (points >= 1000) {
            return "Gold";
        }
        if (points >= 300) {
            return "Silver";
        }
        return "Bronze";
    }
}
