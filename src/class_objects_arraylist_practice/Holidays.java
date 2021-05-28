package class_objects_arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Holidays {
    public static void main(String[] args) {
        System.out.println(holidayPerMonth(1));
    }

    public static ArrayList<String> holidays() {
        ArrayList<String> holidayList = new ArrayList<>();
        holidayList.addAll(Arrays.asList("New Years day, Martin Luther King, Jr. Day", "President's Day", "Memorial Day",
                "Independence Day", "Labor Day", "Columbus Day", "Veterans Day, Thanksgiving Day", "Christmas Day", "None"));
        return holidayList;
    }

    public static ArrayList<String> holidayPerMonth(int month) {
        ArrayList<String> holidayMonth = holidays();
        ArrayList<String> newList = new ArrayList<>();
        switch(month) {
            case 1 :
                newList.add(holidayMonth.get(0));
                break;
            case 2:
                newList.add(holidayMonth.get(1));
                break;
            case 5:
                newList.add(holidayMonth.get(2));
                break;
            case 6:
                newList.add(holidayMonth.get(3));
                break;
            case 9:
                newList.add(holidayMonth.get(4));
                break;
            case 10:
                newList.add(holidayMonth.get(5));
                break;
            case 11:
                newList.add(holidayMonth.get(6));
                break;
            case 12:
                newList.add(holidayMonth.get(7));
                break;
            case 3, 4, 7, 8:
                newList.add(holidayMonth.get(8));
                break;
            default:
                return null;
        }
        return newList;
    }
}
