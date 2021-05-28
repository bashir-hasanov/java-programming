package saim_more_practice;

public class Author {
    public static void main(String[] args) {
        String genreName = "Short Story";
        int pageLength = 0, profit = 0,
                sequels = 0, countries = 0;

        switch (genreName) {
            case "Fantasy":
                pageLength = 500;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                break;
            case "Detective":
                pageLength = 350;
                profit = 700_000;
                sequels = 3;
                countries = 45;
                break;
            case "Science Fiction":
                pageLength = 720;
                profit = 900_500;
                sequels = 4;
                countries = 30;
                break;
            case "Short Story":
                pageLength = 150;
                profit = 300_000;
                sequels = 1;
                countries = 40;
                break;
            default:
                pageLength = 0;
                profit = 0;
                sequels = 0;
                countries = 0;

        }
        System.out.println("genreName = " + genreName);
        System.out.println("pageLength = " + pageLength);
        System.out.println("profit = " + profit);
        System.out.println("sequels = " + sequels);
        System.out.println("countries = " + countries);
    }
}
