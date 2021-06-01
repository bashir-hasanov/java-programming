package Office_Hours.Practice_06_01_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    String productOwner;
    String scrumMaster;
    String businessAnalyst;
    ArrayList<Tester> allTesters;
    ArrayList<Developer> allDevelopers;
    int sprintNumber;

    public ScrumTeam(String productOwner, String scrumMaster, String businessAnalyst) {
        this.productOwner = productOwner;
        this.scrumMaster = scrumMaster;
        this.businessAnalyst = businessAnalyst;
        this.allTesters = new ArrayList<>();
        this.allDevelopers = new ArrayList<>();
    }

    public void addTester(Tester tester) {
        this.allTesters.add(tester);
    }

    public void addTester(Tester ... testers) {
        this.allTesters.addAll(Arrays.asList(testers));
    }

    public static void main(String[] args) {
        ScrumTeam scrumTeam = new ScrumTeam("Ziba", "John", "Anna");
        System.out.println(scrumTeam.allTesters);
        Tester tester1 = new Tester("Maxim", 10, "SDET", 100000.0);
        scrumTeam.addTester(tester1);
        scrumTeam.addTester(new Tester("Parvin", 11, "SDET", 120000.0));
        System.out.println(scrumTeam.allTesters);
    }

}
