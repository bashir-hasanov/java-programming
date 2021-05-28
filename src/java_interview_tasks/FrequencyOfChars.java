package java_interview_tasks;

public class FrequencyOfChars {
    public static void main(String[] args) {
        System.out.println("Frequency of characters in String = " + frequencyOfChars("AAABBCDD"));
    }

    public static String frequencyOfChars(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }
            }
            if (!result.contains("" + str.charAt(i))) {
                result += count + "" + str.charAt(i);
            }
        }
        return result;
    }
}
