package day41_arraylist_continued;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        // cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Mazda");
        myCars.add("Ford");
        myCars.add("Moskvich");
        myCars.add("Tesla");
        myCars.add(0, "Jeep");
        myCars.add(1, "Lada");
        myCars.add(2, "Yugo");

        System.out.println(myCars.toString());
        String allCarsInOneString = myCars.toString(); //sets all cars in one String variable
        System.out.println("allCarsInOneString = " + allCarsInOneString);

        // set --> updates value at certain index, replaces it
        myCars.set(1, "Jiguli");
        System.out.println("New list after set = " + myCars);

        // change Mazda to Honda
        myCars.set(4, "Honda");
        System.out.println("New list after second set = " + myCars);

        String str = "java";
        System.out.println("Index of 'v' = " + str.indexOf('v')); // --> 2

        System.out.println("index of ford = " + myCars.indexOf("Ford"));

        int moskvichIndex = myCars.indexOf("Moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);

        //replace ford with "Traban"

        myCars.set(myCars.indexOf("Ford"), "Trabant");
        System.out.println(myCars);

        if (myCars.contains("Lada")) {
            myCars.set(myCars.indexOf("Lada"), "Bugatti");
                } else {
            System.out.println("Lada is not found");
            }
        System.out.println("Car list after next update --> " + myCars);
        myCars.set(0, "Lamborghini");
        myCars.set(1, "Lada");

        for (int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("Lamborghini")) {
                myCars.set(i, "Prius");
            } else if (myCars.get(i).equals("Lada")){
                myCars.set(i, "Lexus");
            } else if (myCars.get(i).equals("Trabant")) {
                myCars.set(i, "Audi");
            }
        }
        System.out.println("Final car list = " + myCars);


        }
    }

