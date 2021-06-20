package day55_abstraction_interface.exercise.interface_demo;

public class ChromeDriver implements WebDriver {

    public ChromeDriver() {
        System.out.println("Launching Chrome browser");
    }

    @Override
    public void get(String url) {
        System.out.println("ChromeDriver - navigating to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver - locating element by " + locator);
    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver - quitting the driver");
    }

    @Override
    public String getTitle() {
        return "wooden spoon";
    }
}
