package day41_arraylist_continued;
import java.util.*;
public class CitiesList {
    public static void main(String[] args) {
        //declare ArrayList
        ArrayList <String> cities = new ArrayList<>();
        //add values to cities
        cities.add("Baku");           //0
        cities.add("Fairfax");        //1
        cities.add("New York");       //2
        cities.add("Washington DC");  //3
        cities.add("Vienna");         //4
        cities.add("Adana");          //5
        cities.add("Istanbul");       //6

        //add Tashkent to index 0
        cities.add(0, "Tashkent");

        //print all cities
        System.out.println(cities);

        //print first and last city
        System.out.println("First and last city - " + cities.get(0) + ", " + cities.get(cities.size()-1));

        //print count of items in Arraylist
        System.out.println("Count of items = " + cities.size());

        int count = cities.size();
        System.out.println("There are " + count + " cities in the list.");

        //for loop and print all values on the same line
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + ", ");
        }
        System.out.println();
        for (String each : cities) {
            System.out.print(each + ", ");
        }

        //delete an item from ArrayList:
        //1) Remove using index
        cities.remove(5); //Removed Vienna, with index

        //2) Remove using object value
        cities.remove("New York"); //Removed New York, using object

        System.out.println();
        System.out.println("List after removing - " + cities);

        //remove all values from list
        cities.clear();

        //to make sure, list is empty:
        //1) print | spit it out
        System.out.println("Result after clearing the whole list - " + cities);

        //2) use isEmpty() method
        System.out.println(cities.isEmpty()); //true

        //3) check size
        if (cities.size() == 0) {
            System.out.println("List is empty");
        }

    }
}
