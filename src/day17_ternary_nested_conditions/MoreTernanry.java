package day17_ternary_nested_conditions;

public class MoreTernanry {
    public static void main(String[] args) {
        int hourlyRate = 52;
        String reply;
        reply = (hourlyRate > 50) ? "accept" : "reject";
        System.out.println("reply = " + reply);

        int hourlyRate1 = 48;
        if (hourlyRate1 > 50) {
           String reply1 = "accept";
        } else {
            String reply1 = "reject";
            System.out.println("reply1 = " + reply1);
        }
        String todayClass = "java";
        String teacher = (todayClass.equals("java")) ? "Saim/Murodil":"Nadir";
        System.out.println("teacher = " + teacher);

        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive) ? "Have DL, can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);
    }
}
