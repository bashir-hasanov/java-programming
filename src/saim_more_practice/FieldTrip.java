package saim_more_practice;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 3;
        String location;
        String teacher;
        int numberOfGroups = 0;

        switch (grade) {
            case 1:
                location = "Apple Orchard";
                numberOfGroups = 3;
                teacher = "Ms. Smith";
                break;
            case 2:
                location = "Zoo";
                numberOfGroups = 7;
                teacher = "Mr. Lee";
                break;
            case 3:
                location = "Aquarium";
                numberOfGroups = 5;
                teacher = "Ms. Wilson";
                break;
            case 4:
                location = "Movie Theater";
                numberOfGroups = 2;
                teacher = "Ms. Reyes";
                break;
            case 5:
                location = "Museum";
                numberOfGroups = 5;
                teacher = "Ms. Lela";
                break;
            case 6:
                location = "Six Flags";
                numberOfGroups = 8;
                teacher = "Mr. Watt";
                break;
            default:
                location = "Not available";
                numberOfGroups = 0;
                teacher = "not available";
                break;
        }
        System.out.println("grade = " + grade);
        System.out.println("location = " + location);
        System.out.println("numberOfGroups = " + numberOfGroups);
        System.out.println("teacher = " + teacher);
    }
}
