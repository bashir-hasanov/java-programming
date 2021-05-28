package saim_string_practice_2;

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        String first = "apple";
        String second = "banana";
        System.out.println(first.substring(1));
        System.out.println(second.substring(0, second.length()-1));
    }
}
