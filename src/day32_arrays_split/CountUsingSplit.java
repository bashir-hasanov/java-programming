package day32_arrays_split;
import java.util.*;
public class CountUsingSplit {
    public static void main(String[] args) {
        String cats = "bengal cat tabby cat persian cat no cat here";

        String [] catsAr = cats.split(" ");
        System.out.println(cats.split("cat").length-1);

        int count = 0;
        for (int i = 0; i < catsAr.length; i++) {
            if (catsAr[i].equals("cat")) {
                count++;
            }
        }
        System.out.println("There are " + count + " cats.");

        for (String type : catsAr) {
            System.out.println(type);
        }
    }
}
