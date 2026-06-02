public class CustomerProfile {
    private final String name;
    private final String street;
    private final String city;
    private final String postalCode;

    public CustomerProfile(String name, String street, String city, String postalCode) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String mailingLabel() {
        return name + "\n" + street + "\n" + city + " " + postalCode;
    }
}
