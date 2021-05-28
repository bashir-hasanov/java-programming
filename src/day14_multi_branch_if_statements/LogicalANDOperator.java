package day14_multi_branch_if_statements;

public class LogicalANDOperator {
    public static void main(String[] args) {
        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false
        System.out.println(10 > 5 && 2 == 2 );
        System.out.println(6 <= 8 && 3 > 9);
        System.out.println(45 != 45 && 78 > 50);
        System.out.println(21 == 800 && 32 > 132);
        System.out.println("---------------------------");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);

        int apples = 10; int oranges = 5;
        boolean check = apples > 5 && oranges > 3;
        System.out.println("check = " + check);
        if (apples > 6 && oranges > 2) {
            System.out.println("I have enough apples and oranges.");
        } else {
            System.out.println("I have to go to grocery to buy some apples and oranges.");
        }
    }
}
