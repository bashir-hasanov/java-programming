package day61_exceptions_collections;

/**
 * Custom Exception type that extends RuntimeException class
 */

public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException() {}

    public InsufficientBalanceException(String message) {
        super(message);
    }

}
