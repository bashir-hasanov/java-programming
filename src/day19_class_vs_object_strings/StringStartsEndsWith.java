package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String brand = "NEStorIAN";
        System.out.println(brand.startsWith("NESt"));  //true
        System.out.println(brand.startsWith("neST")); //false
        System.out.println(brand.endsWith("rIAN"));  //true
        System.out.println(brand.endsWith("rian")); //false
        System.out.println(brand.startsWith("NEStorIAN"));
        System.out.println(brand.endsWith("NEStorIAN"));

        String word = " intellij idea";
        System.out.println(word.startsWith(" ")); //true
        System.out.println(word.startsWith(" Int")); //false


    }
}
