package day40_arraylist;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(45);
        nums.add(-3);
        nums.add(0);
        nums.add(11);
        //nums.add("java"); --> ERROR

        System.out.println("size = " + nums.size());

        //reading from Arraylist
        System.out.println("index 0 = " + nums.get(0));
        System.out.println("index 0 = " + nums.get(1));
        System.out.println("index 0 = " + nums.get(2));
        System.out.println("index 0 = " + nums.get(3));
        //System.out.println("index 0 = " + nums.get(4)); --> indexOutOfBoundException

        //print all values in same line
        System.out.println(nums);
        nums.remove(1);  //remove elements at index 1
        System.out.println(nums);


    }
}
