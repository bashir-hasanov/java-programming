package day48_constructors_static;
import java.util.*;
public class CustomerObjects {
    public static void main(String[] args) {
        Customer cst1 = new Customer();
        System.out.println(cst1.toString());

        cst1.setId(1);
        cst1.setName("Bashir");
        System.out.println(cst1);

        Customer cst2 = new Customer("Mike", 2); //create object and assign values in same statement
        Customer cst3 = new Customer("John Ward |||", 4873);
        cst3 = new Customer("Charles", 5);
        System.out.println(cst2);
        System.out.println(cst3);

        //array of Customers
        Customer[] todayCustomers = {cst1, cst2, cst3, new Customer("Bashir", 449)};

        //arrayList of Customer objects

        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(cst1);
        customerList.add(cst2);
        customerList.add(cst3);
        customerList.add(new Customer("Bashir", 449));
        customerList.add(new Customer("Suleyman", 9763));
        customerList.add(new Customer("Parvin", 2797));

        //print toString
        System.out.println(todayCustomers[0]);
        System.out.println(customerList.get(0));

        System.out.println(Arrays.toString(todayCustomers));
        System.out.println(customerList);

        System.out.println("----- FOR LOOP -----");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }

        System.out.println("----- FOR EACH LOOP -----");
        for (Customer each : customerList) {
            System.out.println(each);
            System.out.println(each.getName());
        }

        //print only names of Customers in the list
        System.out.println("----- NAMES OF CUSTOMERS: lambda expression");
        customerList.forEach(each -> System.out.println(each.getName()));

        System.out.println("----- NAMES OF CUSTOMERS: for each loop");
        for(Customer eachCustomer : customerList ) {
            System.out.println(eachCustomer.getName());
        }

    }
}
