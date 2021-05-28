package alldays_homework;

public class Work9 {
    public static void main(String[] args) {
        int salary = 120000;
        boolean isFullTime = false;
        if (isFullTime) {
            salary = salary + 20000;
            System.out.println( " Your salary now is " + salary + " because you are a full-time employee.");
        } else {
            salary = salary - 5000;
            System.out.println("Your salary now is " + salary + " because you are a part-time employee");
        }
    }
}
