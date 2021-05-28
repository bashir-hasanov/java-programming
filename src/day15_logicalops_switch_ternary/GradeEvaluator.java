package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';
        if (grade == 'A' || grade == 'a' || grade == 'B' || grade == 'b' ||
                grade == 'C' || grade == 'c') {
            System.out.println("You passed with " + grade);
        } else if (grade == 'D') {
            System.out.println("You are qualified to retake with " + grade);
        } else if (grade == 'E') {
            System.out.println("You failed the exam with " + grade);
        } else {
            System.out.println("Invalid grade");        }
    }
}
