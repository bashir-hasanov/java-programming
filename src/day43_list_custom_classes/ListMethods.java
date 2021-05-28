package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println("getDays().size() = " + getDays().size());
        System.out.println("getDays().get()) = " + getDays().get(0));

        List<String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("java day");

        // removeIf method starting from java 8 -> accepts lambda - and easy to remove without using loop
        dayNames.removeIf(day -> day.length() == 6);
        System.out.println("dayNames after removeIf = " + dayNames);

        int numbers = 12;
        System.out.println(getRandomList(numbers));



    }

    public static List<String> getDays() {
        List<String> days = new ArrayList<>();
        days.add("Monday"); days.add("Tuesday"); days.add("Wednesday");days.add("Thursday");
        days.add("Friday"); days.add("Saturday"); days.add("Sunday");
        return days;
    }

    public static List<Integer> getRandomList(int size) {
        List<Integer> nums = new ArrayList<>();
        Random random = new Random(101);
        for (int i = 1; i <= size; i++) {
            nums.add(random.nextInt(101));
            nums.removeIf(a -> a < 50 && a > 30);
        }
        return nums;
    }
}
