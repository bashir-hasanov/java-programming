package saim_loop_practice;

public class CamelCase {
    public static void main(String[] args) {
        String word = "thisHasManyWordsToFindYouKnowWhyBecauseItChecksPerfectly";
        int count = 1;
        for ( int idx = 0; idx < word.length(); idx ++) {
            if ( word. charAt(idx) >= 'A' && word.charAt(idx) <= 'Z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
