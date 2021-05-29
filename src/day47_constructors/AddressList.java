package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address myAddress = new Address(); // calling constructor automatically
        myAddress.setStreet("12237 Pender Creek Circle, Apt F");
        myAddress.setCity("Fairfax");
        myAddress.setState("Virginia");
        myAddress.setZipCode("22033");

        System.out.println("Street --> " + myAddress.getStreet());
        System.out.println("City --> " + myAddress.getCity());
        System.out.println("State --> " + myAddress.getState());
        System.out.println("Zip Code --> " + myAddress.getZipCode());
        System.out.println("My Address --> " + myAddress.toString());
        System.out.println(myAddress);

        // update my update
        myAddress.setStreet("4720 Quite Woods Lane, Apt E");
        System.out.println("Address after update --> " + myAddress);

        Address newAddress = new Address(); // calling constructor automatically
        System.out.println(newAddress.toString());

        // creating new object with constructor method
        Address papaJohnsPizza = new Address("8501 Tyco Rd Ste 1A", "Vienna", "VA", "22102");
    }
}
