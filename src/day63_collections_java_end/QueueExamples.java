package day63_collections_java_end;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.add("five");
        queue.add("six");

        System.out.println(queue.element()); //if empty, throws NoSuchElementException
        System.out.println(queue.peek());    //if empty, returns "null"

        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
