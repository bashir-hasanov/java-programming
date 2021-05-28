package day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size = " + letters.size());
        System.out.println("original = " + letters);

        Collections.reverse(letters);
        System.out.println("reversed = " + letters);
        // find count of 'a' in the list
        System.out.println("Number of 'a' = " + Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char = " + Collections.max(letters));

        System.out.println("Min char = " + Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters, 'a', 'u');
        Collections.replaceAll(letters, 'i', 'j');
        System.out.println("After replaceAll = " + letters);

        Collections.sort(letters);
        System.out.println("After sorting = " + letters);


        List<Integer> nums = Arrays.asList(23, 1, 5, 43, 5, 234, 1, 5, 5, 1, 5, 5, 7, -9, 0, 5, 1, 12);

        System.out.println(nums);

        Collections.reverse(nums);
        System.out.println("nums after reverse = " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println("Maximum number = " + max);
        System.out.println("Minimum number = " + min);

        int countOfFives = Collections.frequency(nums, 5);
        System.out.println("count of 5 = " + countOfFives);

        int countOfOnes = Collections.frequency(nums, 1);
        System.out.println("count of 1 = " + countOfOnes);

        Collections.replaceAll(nums, 5, 50);
        System.out.println("After replaceAll = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("After reversed sort = " + nums);

        Collections.shuffle(nums); // randomly shuffling
        System.out.println("After shuffle = " + nums);
    }
}
