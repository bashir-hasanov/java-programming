package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int total1 = Integer.parseInt(total);
        System.out.println(total + 55);
        System.out.println(total1 + 55);

        String price = "123.99";
        double price1 = Double.parseDouble(price);
        System.out.println(price + 0.01);
        System.out.println(price1 + 0.01);

        String strPrice = "123.4";
        double priceE = Double.parseDouble(strPrice);
        if (priceE > 100) {
            System.out.println("Expensive");
        }

        String sentence = "I wrote 6546 lines of code";
        String[] newSent = sentence.split(" ");
        int linesOfCode = Integer.parseInt(newSent[2]);
        System.out.println("Lines of code = " + linesOfCode);
    }
}
