package saim_string_practice_2;

public class SmsParts {
    public static void main(String[] args) {
        String message = "Sender: <James Bond> From Number[222-333-4444] Message:{Hello, lets code some java}";
        String sender = message.substring(message.indexOf('<')+1, message.indexOf('>'));
        String number = message.substring(message.indexOf('[')+1, message.indexOf(']'));
        String messageBody = message.substring(message.indexOf('{')+1, message.indexOf('}'));

        System.out.println("sender = " + sender);
        System.out.println("number = " + number);
        System.out.println("messageBody = " + messageBody);
    }
}
