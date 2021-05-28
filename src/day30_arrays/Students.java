package day30_arrays;

import java.util.Locale;

public class Students {
    public static void main(String[] args) {
        String [] student1 = {"Bashir", "Hasanov", "Batch 22", "571-685-0440", "#0449"};

        String [] student2 = new String[5];
        student2 [0] = "Alan";
        student2 [1] = "Smith";
        student2 [2] = "Batch 20";
        student2 [3] = "703-300-2990";
        student2 [4] = "#5874";

        System.out.println("Student 1 First Name = " + student1 [0]);
        System.out.println("Student 1 Last Name = " + student1 [1]);
        System.out.println("Student 1 Batch No = " + student1 [2]);
        System.out.println("Student 1 Phone No = " + student1 [3]);
        System.out.println("Student 1 ID =  " + student1 [4]);

        System.out.println("\nStudent 2 First Name = " + student2 [0]);
        System.out.println("Student 2 Last Name = " + student2 [1]);
        System.out.println("Student 2 Batch No = " + student2 [2]);
        System.out.println("Student 2 Phone No = " + student2 [3]);
        System.out.println("Student 2 ID = " + student2 [4]);

        System.out.println("student data length: " + student1.length);

        if (student1.length == 5) {
            System.out.println("student 1 data array has correct length");
        } else {
            System.out.println("student 1 data array has incorrect length");
        }

        if (student1.length == student2.length) {
            System.out.println("PASS: data arrays length match");
        } else {
            System.out.println("FAIL: data arrays length mismatch");
        }

        System.out.println(student1 [0].toUpperCase() + "\s" + student1 [1].toUpperCase());
        System.out.println(student2 [0].toUpperCase() + " " + student2 [1].toUpperCase());
        System.out.println((student1 [0] + " " + student1 [1]).toLowerCase());

        String mobileNum = student1 [3];
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("571"));
    }
}
