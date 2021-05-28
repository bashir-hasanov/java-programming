package day44_custom_classes;

public class App {
    String name;
    double version;

    public void open() {
        System.out.println("I clicked on and opened my " + name + " app to update it to " + version + " version.");
    }
}

class AppObject {
    public static void main(String[] args) {
        App newApp = new App();
        newApp.name = "Uber Eats";
        newApp.version = 8.2;
        System.out.println("name = " + newApp.name);
        System.out.println("version = " + newApp.version);
        newApp.open();
    }
}