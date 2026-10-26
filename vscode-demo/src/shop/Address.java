package shop;

public class Address {
    private final String street;
    private final String city;
    private final String zip;

    public Address(String street, String city, String zip) {
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    public String mailingLabel() {
        return street + "\n" + zip + " " + city;
    }

    public boolean isIn(String storeCity) {
        return city != null && city.equalsIgnoreCase(storeCity);
    }
}
