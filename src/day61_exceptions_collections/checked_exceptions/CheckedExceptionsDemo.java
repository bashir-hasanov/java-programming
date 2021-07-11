package day61_exceptions_collections.checked_exceptions;

public class CheckedExceptionsDemo {
    /**
     *DECLARING USING THROWS KEYWORD
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("About to sleep for 5 seconds");

        /**
         * Thread.sleep(5000); causes /throws an InterruptedException, which is a
         * checked exception
         * We ARE HANDLING IT
         */
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.sleep(5000);

        System.out.println("Woke up after 10 seconds");
    }

}
