package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String word = "job";
        System.out.println(word.isEmpty()); //false

        String car = new String();
        System.out.println(car.isEmpty()); //true

        String book = "";
        System.out.println(book.length() == 0); //true
        System.out.println(book.isEmpty());     //true

        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());  //true

        if (jobTitle.isEmpty()) {
            System.out.println("Job title is missing, please resend.");
        } else {
            System.out.println("Job title looks good.");
        }

        if (jobTitle.length() == 0) {
            System.out.println("Job title is empty");
        } else {
            System.out.println("Job title is not empty.");
        }

        System.out.println(jobTitle.equals(""));

        String word1 = " ";
        System.out.println(word1.isEmpty()); //length
        System.out.println(word1.length());  //1

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());  //false

        if (!veggie.isEmpty()) {
            System.out.println("We have " + veggie);
        }


    }
}

