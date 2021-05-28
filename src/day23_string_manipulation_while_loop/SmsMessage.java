package day23_string_manipulation_while_loop;
public class SmsMessage {
    public static void main(String[] args) {
        String message = "Sender: [Saim] From Number<+1222-333-4444> Message:{Hello, lets code some java}";

        String sender = message.substring(message.indexOf('[')+1, message.indexOf(']'));
        System.out.println("sender = " + sender);

        String number = message.substring(message.indexOf('<')+1, message.indexOf('>'));
        System.out.println("number = " + number);

        String text = message.substring(message.indexOf('{')+1, message.indexOf('}'));
        System.out.println("text = " + text);

        if (sender.equals("Saim")) {
            System.out.println("Message from Saim about homework.");
        } else {
            System.out.println("Message from someone else.");
        }

    }
}
