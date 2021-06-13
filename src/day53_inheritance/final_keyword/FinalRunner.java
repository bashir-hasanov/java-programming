package day53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
        //TestData.ADMIN_USERNAME = "change"; --> ERROR: cannot change value of final variable

        final int SSN = 1475896652;
        //int = 4785246687; --> ERROR: cannot change value of final variable
    }
}
