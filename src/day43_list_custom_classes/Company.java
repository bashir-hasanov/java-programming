package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Bashir";
        employee1.jobTitle = "SDET";
        employee1.work();
        System.out.println(employee1.name);
        System.out.println(employee1.jobTitle);

        Employee employee2 = new Employee();
        employee2.name = "Ertugrul Qazi";
        employee2.jobTitle = "Oguz beyi";
        employee2.work();
        System.out.println(employee2.name);
        System.out.println(employee2.jobTitle);

        Employee employee3 = new Employee();
        employee3.name = "Winnie Pooh";
        employee3.jobTitle = "Cartoon Hero";
        employee3.work();
        System.out.println(employee3.name);
        System.out.println(employee3.jobTitle);

    }
}
