package shop;

public class CustomerProfile {
    private final Account account;
    private String email;
    private Address address;
    private boolean emailOptedIn;

    public CustomerProfile(Account account, String email, Address address, boolean emailOptedIn) {
        this.account = account;
        this.email = email;
        this.address = address;
        this.emailOptedIn = emailOptedIn;
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
        return emailOptedIn && email != null && email.contains("@");
    }
}
