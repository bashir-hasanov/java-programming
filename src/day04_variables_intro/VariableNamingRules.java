package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args) {
        // System.out.println("BREAK TILL 4:10 PM EST");
        // int static=22; -> error, static is reserved by java
        int static2=22;
        int _static=22;
        int $tatic=44;
        int staticVar=234;
        int salary$=55;
        // int1stmonthsalary=3000; -> error, cannot start with number
        int $ =10; // not encouraged
        System.out.println($);

        // int number-of-friends=400; => error, banned symbol(-)
        // int numberOfFriends=400; => it works
    }
}
