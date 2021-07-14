package day62_collections;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        List<String> states = new Vector<>();
        states.add("MA");
        states.add("VA");
        states.add("MS");
        states.add("CA");
        states.add("TX");
        states.add("CO");
        states.add("IL");
        states.add("PA");
        states.add("OK");
        states.add("MD");
        states.add("MD");
        System.out.println(states);
        System.out.println("Number of states = " + states.size());
    }
}
