package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();

    }

    public static void openBrowser() {
        System.out.println("--- Starting Etsy Search Smoke Test ---");
        System.out.println("1. Launching Chrome browser");
    }

    public static void navigateToEtsyUrl() {
        System.out.println("2. Navigating to https://www.etsy.com/");
    }

    public static void searchForWoodenSpoon() {
        System.out.println("*** PASS: Verify Etsy homepage is displayed");
        System.out.println("4. Type 'wooden spoon' in search field and click SEARCH");
    }

    public static void verifyResultsAreDisplayed() {
        System.out.println("*** PASS: Search results are successfully displayed");
        System.out.println("--- Etsy Search Smoke Test Completed --> PASS ---");
    }
}
