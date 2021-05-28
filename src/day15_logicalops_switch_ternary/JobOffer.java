package day15_logicalops_switch_ternary;

public class JobOffer {
    public static void main(String[] args) {
        // location, salary, benefits, remote
        boolean hasBenefits = true;
        boolean isRemote = false;
        int mySalary = 105_000;
        String location = "DC Metro Area";
        if (hasBenefits && isRemote && location.equals("DC Metro Area") && mySalary >= 105000 ) {
            System.out.println("I accept this offer.");
        } else {
            System.out.println("Let`s consider another offer or negotiate.");
        }
    }
}
