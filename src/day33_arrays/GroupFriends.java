package day33_arrays;

public class GroupFriends {
    public static void main(String[] args) {
        String friends = "Alihan,Dinara,Tolga,Anastasia,Rreze,Vladimir,Gokyuzu,Zebib,Jorge";
        String[] friendsNames = friends.split(",");

        for (String each : friendsNames) {
            System.out.println("Happy Holidays, " + each + "!");
        }
    }
}
