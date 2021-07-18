package day63_collections_java_end;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("john");
        list.add("jamie");
        list.add("jorge");

        System.out.println(list);

        Iterator<String> iter = list.iterator();
        System.out.println(iter.next());
        iter.remove();

        System.out.println(list);

        Set<String> names = new HashSet<>();
        names.add("james");
        names.add("kinga");
        names.add("Parvin");
        names.add("MJ");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String currentName = iterator.next();
            System.out.println(currentName);

            if (currentName.length()<3) {
                iterator.remove();
            }
        }
        System.out.println(names);
    }
}
