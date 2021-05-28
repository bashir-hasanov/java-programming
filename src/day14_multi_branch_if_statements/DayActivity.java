package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "nasty";
        //Go to park. take an umbrella. Put your hat and scarf on. Go to shopping.
        //else: Just keep coding Java
        if (weather.equals("sunny")) {
            System.out.println(weather + " - Go to park.");
        } else if (weather.equals("rainy")) {
            System.out.println(weather + " - Take an umbrella");
        } else if (weather.equals("snowy")) {
            System.out.println(weather + " - Put your hat and scarf on.");
        } else if (weather.equals("windy")) {
            System.out.println(weather + " - Go to shopping");
        } else {
            System.out.println(weather + " - Just keep coding java");
        }
        System.out.println("Coding Java does not depend on weather condition");
    }
}
