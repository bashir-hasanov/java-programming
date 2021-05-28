package day07_arithmetic_operators_casting;

public class StringConcat {
    public static void main(String[] args) {
        System.out.println("java" + 5 + 3);   //java53
        System.out.println("java" + (5 + 3)); //java8
        System.out.println(5 + 3 + "java");  //8java

        System.out.println("java" + 5 * 3);   //java15
        System.out.println(5 + (3 + "java")); //53java
        System.out.println("Hello" + 1 + 2 + 3); //Hello123
        System.out.println("Hello" + (1 + 2 + 3)); //Hello6

        String str1= "Hello", str2 = "friends";
        System.out.println(str1 + str2); //Hellofriends
        System.out.println(str1 + " " + str2); //Hello friends

        int num1 = 7, num2 = 8;
        System.out.println(num1 + num2); //15
        System.out.println(num1 + " " + num2); //7 8
        System.out.println(num1 + "" + num2); //78
        System.out.println(num1 + (num2)); //15

        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1 + char2);       //195
        System.out.println(char1 + "" + char2);  //ab
    }
}
