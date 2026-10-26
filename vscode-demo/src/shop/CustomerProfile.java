package shop;

public class CustomerProfile {
    private final Account account;
    private String email;
    private Address address;
    private boolean optedIn;

    public CustomerProfile(Account account, String email, Address address, boolean optedIn) {
        this.account = account;
        this.email = email;
        this.address = address;
        this.optedIn = optedIn;
    }

    public Account getAccount() {
        return account;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public boolean canReceivePromotion() {
        return optedIn && email != null && email.contains("@");
    }
}
