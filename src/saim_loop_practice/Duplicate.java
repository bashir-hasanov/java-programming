package saim_loop_practice;

public class Duplicate {
    public static void main(String[] args) {
        String str = "AAABCCDEEF";
        String checked = "";
        for ( int i = 0; i < str.length(); i++) {
            int count = 0;
            if (checked.contains("" + str.charAt(i))) {

            }
            for ( int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count >1) {
                System.out.println(str.charAt(i) + " is duplicate");
            }
            checked += str.charAt(i);
        }
    }
}
