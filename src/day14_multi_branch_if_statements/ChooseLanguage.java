package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose your language, please.");
        int selection = 7;
        if (selection == 1) {
            System.out.println("Thanks for your call.");
        } else if (selection == 2) {
            System.out.println("Hola gracias para llamar");
        } else if (selection == 3) {
            System.out.println("Merhaba, aradiginiz ichin teshekkurler");
        } else if (selection == 4) {
            System.out.println("privet, spasibo za zvonok");
        } else if (selection == 5) {
            System.out.println("Merci, pour votre appel");
        } else {
            System.out.println("Hello, let`s speak java and english.");
        }
        System.out.println("It is good to speak many languages");
    }
}
