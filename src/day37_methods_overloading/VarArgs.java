package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10, 20);
        addNumbers(100, 200, 300);
        addNumbers(21, 56, 365, 12, 457, 589, 1245, 365, 457, 213, 457, 658, 21, 321);
        addNumbers();
    }

    public static void addNumbers (int ... nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println("sum = " + sum);
    }
}
