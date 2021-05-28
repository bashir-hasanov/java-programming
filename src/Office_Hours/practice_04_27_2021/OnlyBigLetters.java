package Office_Hours.practice_04_27_2021;

public class OnlyBigLetters {
    public static void main(String[] args) {
        String str  = "Hello We Are Learning Java at CyberTeck ScHool";
        String onlyBig = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                onlyBig += str.charAt(i);
            }
        }
        System.out.println(onlyBig);
    }
}
