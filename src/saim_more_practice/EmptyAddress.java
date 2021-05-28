package saim_more_practice;
public class EmptyAddress {
    public static void main(String[] args) {
        String address = "4708 Harvest Woods Court";

        if (address.isEmpty()) {
            System.out.println("No address found.");
        } else {
            System.out.println(address.toUpperCase());
        }
    }
}
