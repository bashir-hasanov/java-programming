package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';
      //  System.out.println("letter = " + letter);  //letter = a
      //  letter++;
      //  System.out.println("letter = " + letter);  //letter = b

        while (letter <= 'z') {
            System.out.print(letter + " ");
            letter++;
        }
        System.out.println("End of the alphabet");

        letter = 'z';
        while (letter >= 'a') {
            System.out.print(letter + " ");
            letter--;
        }
        System.out.println("Alphabet starts here");
    }
}
