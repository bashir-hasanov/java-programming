package day61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 45;
        System.out.println("Class is going on for " + minutes + " minutes.");
        if (minutes > 50) {
            throw new BreakTimeException("It is break time!");
        }
        System.out.println("Let's continue the class");


        double balance = 400.0;
        double price = 500;
        System.out.println("Item price cannot exceed the balance - $" + balance);
        if (price > balance) {
            throw new InsufficientBalanceException("Transaction declined! You do not have enough balance!");
        }
        System.out.println("Thank you for shopping with us!");
    }
}
