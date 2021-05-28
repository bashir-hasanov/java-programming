package saim_more_practice;

public class TernaryLoan {
    public static void main(String[] args) {
        int salary = 62_000;
        int creditScore = 780;

        String loan = (salary > 60000 && creditScore > 650) ? "Loan Approved":"Loan Denied";
        System.out.println("loan status --> " + loan);
    }
}
