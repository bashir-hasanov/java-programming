package day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?");
        char selection = 'j';
        boolean answer;
        if (selection == 'y') {
            System.out.println("Your file will be deleted");
            answer = true;
        } else {
            System.out.println("File deletion cancelled");
            answer = false;
        }
        System.out.println("Was file deleted? - " + answer);
    }
}
