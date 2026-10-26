package shop;

public class CustomerProfile {
    private final Account account;
    private String email;
    private String street;
    private String city;
    private String zip;
    private boolean optedIn;

    public CustomerProfile(Account account, String email, String street, String city, String zip, boolean optedIn) {
        this.account = account;
        this.email = email;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.optedIn = optedIn;
    }

    public Account getAccount() {
        return account;
    }

    public String getEmail() {
        return email;
    }

    public String mailingLabel() {
        return street + "\n" + zip + " " + city;
    }

    public boolean isLocal(String storeCity) {
        return city != null && city.equalsIgnoreCase(storeCity);
    }

    public boolean canReceivePromotion() {
        return optedIn && email != null && email.contains("@");
    }
}
