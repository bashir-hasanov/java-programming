package saim_more_practice;

public class TernarySport {
    public static void main(String[] args) {
        String sport = "Volleyball";
        int entranceFee = (sport.equals("Tennis") || sport.equals("Soccer")) ? 100:50;
        System.out.println("entranceFee = " + entranceFee);
    }
}
