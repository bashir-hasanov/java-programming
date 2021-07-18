package day63_collections_java_end;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> bookStack = new Stack<>();
        bookStack.add("Harry Potter");
        bookStack.add("Leaders eat Last");
        bookStack.add("Martin Eden");
        bookStack.add("Angels and Demons");
        bookStack.add("Les Miserables");

        System.out.println(bookStack);

        bookStack.pop(); //removes and returns the top of the stack item
        System.out.println(bookStack);

        bookStack.remove(bookStack.size()-1);
        System.out.println(bookStack);

        System.out.println("This is at the top of the stack = " + bookStack.peek());
        System.out.println(bookStack);
    }

}
