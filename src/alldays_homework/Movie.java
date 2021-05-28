package alldays_homework;

public class Movie {
    public static void main(String[] args) {
        String $movieName = "Titanic";
        String $genre = "Romance/Drama";
        short $duration = 195;
        String $releaseDate = "19 December 1997";
        String $rating = "PG-13";
        boolean $isSequel = false;
        byte $rottenTomatoesRating = 89;
        boolean $isOnDvd = true;

        System.out.println("-------------------------------WELCOME TO CINEMA-------------------------------\n\tTonight " +
                "we are streaming the movie of " + $movieName +
                " which was released on " + $releaseDate + ".\nThis " + $genre + " movie got a " +
                $rottenTomatoesRating + " (out of 100) rating on Rotten Tomatoes.\nThe rating is " +
                $rating + " and it runs for " + $duration + " minutes.\nThis is not a sequel (" +
                $isSequel + ") and is on dvd (" + $isOnDvd + ").");
    }
}
