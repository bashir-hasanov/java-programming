package day59_polymorphism_exceptions;

public class WebElementUtil {
    public static void clickElement(WebElement elem) {
        System.out.println("Clicking on Element");
        elem.click();
    }

    public static WebElement getLinkWithText(String txt) {
        System.out.println("Searching for a link text - " + txt);
        return new Link();
    }
}
