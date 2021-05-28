package saim_arrays_practice;

public class MultipleWords {
    public static void main(String[] args) {
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String wordsArr[] = words.split(", ");

        for (String eachWord : wordsArr) {
            if (eachWord.contains(" ")) {
                System.out.println(eachWord);
            }

        }
    }
}
