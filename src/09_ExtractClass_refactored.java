public class CustomerProfile {
    private final String name;
    private final Address address;

    public CustomerProfile(String name, String street, String city, String postalCode) {
        this.name = name;
        this.address = new Address(street, city, postalCode);
    }

    public String mailingLabel() {
        return name + "\n" + address.format();
    }
}

class Address {
    private final String street;
    private final String city;
    private final String postalCode;

    public Address(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String format() {
        return street + "\n" + city + " " + postalCode;
    }
}
