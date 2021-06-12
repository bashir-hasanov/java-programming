package day52_inheritance;

public class Discord extends MobileApp {

    public void chat(String someone) {
        System.out.println("Chatting with " + someone + " on Discord.");
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chat("Bashir");
    }

    @Override
    protected boolean download() {
        System.out.println("Downloaded Discord " + version + " from the App Store.");
        return true;
    }
}
