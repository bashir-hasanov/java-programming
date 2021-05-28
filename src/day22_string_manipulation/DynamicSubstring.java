package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        System.out.println(result.substring(13, 18));
        System.out.println(result.substring(13));
        //find index of :
        System.out.println(result.indexOf(":"));
        System.out.println(result.indexOf(" "));
        System.out.println(result.substring(result.indexOf(":") + 1));

        String today = "I learned [java] today.";
        int index1 = today.indexOf("[");
        System.out.println("index1 = " + index1);
        int index2 = today.indexOf("]");
        System.out.println("index2 = " + index2);
        System.out.println(today.substring(index1 +1, index2));
    }
}
