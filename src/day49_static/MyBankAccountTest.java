package day49_static;

public class MyBankAccountTest {
    public static void main(String[] args) {
        MyBankAccount husband = new MyBankAccount();
        husband.user = "Simba";
        husband.showBalance();
        husband.spend(100.0);
        husband.showBalance();

        MyBankAccount wife = new MyBankAccount();
        wife.user = "Timon";
        wife.showBalance();
        wife.spend(400);
        wife.showBalance();

        husband.showBalance();
    }
}
