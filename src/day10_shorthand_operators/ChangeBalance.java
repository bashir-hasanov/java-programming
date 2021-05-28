package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1200.44;
        System.out.println("balance = " + balance);

        double baklava = 22.5;
        balance = balance - baklava;
        System.out.println("baklava = " + baklava);
        System.out.println(" balance after baklava = " + balance);
        double kunefe = 44.45;
        System.out.println("kunefe = " + kunefe);
        balance = balance - kunefe;
        System.out.println("balance after kunefe = " + balance);
        kunefe = kunefe / 2;
        System.out.println("kunefe = " + kunefe);
        balance = balance - kunefe;
        System.out.println("balance after kunefe = " + balance);
        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("balance after plov = " + balance);
        double icedTea = 3.0;
        System.out.println("icedTea = " + icedTea);
        //buy 4 icedTeas and decrease balance

        balance = balance - 4 * icedTea;
        System.out.println("balance after 4 iced teas = " + balance);
        //return baklava
        balance = balance + baklava;
        System.out.println("balance after returning baklava = " + balance);


    }
}
