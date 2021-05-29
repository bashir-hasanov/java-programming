package day47_constructors;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";

    //this is constructor method
    public Address() {
        System.out.println("Address constructor");
        street = "123 Unknown St";
        city = "Java";
        state = "WSP";
        zipCode = "00000";
    }

    // second constructor, overloaded constructor --> provides shortcut to initialize variables
    // in same statement: ex: Address ad = new Address("123 java St", "Boston", "MA", "43213");
    // this is constructor method with params
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        setState(state);
        setCity(city);
        this.zipCode = zipCode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setCity (String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        if (state.isEmpty() || state.length() > 50) {
            System.out.println("ERROR: Invalid street");
        } else {
            this.state = state;
        }
    }

    public String getState() {
        return state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}
