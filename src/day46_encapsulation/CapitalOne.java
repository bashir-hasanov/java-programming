package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount capOne = new CheckingAccount();
        capOne.setAccountNumber(547801236620l);
        capOne.setBalance(4750.32);
        capOne.setAccountHolder("John Smith");
        capOne.setType("360 Checking");

        System.out.println("Account number = " + capOne.getAccountNumber());
        System.out.println("Balance = $" + capOne.getBalance());
        System.out.println("Account holder: " + capOne.getAccountHolder());
        System.out.println("Account type = " + capOne.getType());
        System.out.println(capOne);
    }
}
