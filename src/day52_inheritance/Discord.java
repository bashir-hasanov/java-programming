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
        System.out.println("Downloaded Discord 8.0.2.1 from the App Store.");
        return true;
    }

    public void printInfo() {
        System.out.println("App Name = " + getName());
        System.out.println("App Version = " + getVersion());
    }
}
