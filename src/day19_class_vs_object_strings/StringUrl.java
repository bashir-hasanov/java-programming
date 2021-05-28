package day19_class_vs_object_strings;

public class StringUrl {
    public static void main(String[] args) {
        String url = "https://google.com";
                if (url.endsWith(".com")) {
                    System.out.println("Commercial website");
                } else if (url.endsWith(".ru")) {
                    System.out.println("Russian website");
                } else if (url.endsWith(".org")) {
                    System.out.println("Organizational website");
                } else if (url.endsWith(".gov")) {
                    System.out.println("Government website");
                } else if (url.endsWith(".edu")) {
                    System.out.println("Educational website");
                } else {
                    System.out.println("Not a valid input");
                }
    }
}
