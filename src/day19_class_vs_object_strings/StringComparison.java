package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        // equals() method --> case SENSITIVE
        System.out.println(city.equals("Chicago"));
        System.out.println(city.equals("chicago"));
        System.out.println(city.equals("chicAGO"));
        System.out.println(city.equals("Chicago "));

        // equalsIgnoreCase() method --> case INSENSITIVE
        System.out.println(city.equalsIgnoreCase("CHICAGo"));   //true
        System.out.println(city.equalsIgnoreCase("chicago"));   //true
        System.out.println(city.equalsIgnoreCase(" ChiCaGo ")); //false
        System.out.println(city.equalsIgnoreCase("Chiicago"));  //false
        System.out.println(city.equalsIgnoreCase("ChiCa go"));  //false

        if (city.equals("CHICAGO")) {
            System.out.println("equals() true");
        } else {
            System.out.println("equals () false");
        }

        if (city.equalsIgnoreCase("CHICAGO")) {
            System.out.println("equalsIgnoreCase() true");
        } else {
            System.out.println("equalsIgnoreCase () false");
        }

    }
}
