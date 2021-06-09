package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee();
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(55);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));


    }
}
