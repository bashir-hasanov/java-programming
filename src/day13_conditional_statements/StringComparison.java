package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if (city.equals("Los Angeles")) {
            System.out.println("It is LA.");
        } else {
            System.out.println("It is not LA.");
        }

        String weather = "rainy";
        if (weather == "sunny") {
            System.out.println("The weather is so beautiful.");
        } else {
            System.out.println("The weather is nasty today.");
        }
    }
}
