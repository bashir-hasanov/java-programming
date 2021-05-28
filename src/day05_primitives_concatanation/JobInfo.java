package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args) {
        String title = "Java SDET";
        String company = "Microsoft";
        String jobDescription = "Experience in Java, Selenium, Cucumber and Tomato.";
        int salary = 120000;
        byte yearxExp = 5;
        boolean hasBenefits = true;
        System.out.println("Job title: " + title);
        System.out.println("Company name: " + company);
        System.out.println("Job description: " + jobDescription);
        System.out.println("Salary: $" + salary);
        System.out.println("Minimum " + yearxExp + " years of experience.");
        System.out.println("Has benefits? " + hasBenefits);
    }
}
