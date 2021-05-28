package practice_03_17_2021;

public class CybertekBatches {
    public static void main(String[] args) {
        String batchType = "US";
        if (batchType.equals("US") || batchType.equals("us")) {
            boolean isMorning = false;
            if (isMorning) {
                System.out.println("Class times are 10-5 EST. M, Tu, TH, F");
            } else {
                System.out.println("Class times are 7-10 EST. M, Tu, We, Th, Sa, Su ");
            }

        } else if (batchType.equals("EU") || batchType.equals("eu")) {
            System.out.println("Class times are 10-5 EST. M, Tu, TH, F");
        } else {
            System.out.println("Invalid batch type");
        }
    }
}