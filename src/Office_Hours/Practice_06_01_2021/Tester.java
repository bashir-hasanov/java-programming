package Office_Hours.Practice_06_01_2021;

public class Tester {
    private String name;
    private int employeeId;
    private String jobTitle;
    private double salary;

    public Tester(String name, int employeeId, String jobTitle, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Tester: " +
                "name = '" + name + '\'' +
                ", employeeId = " + employeeId +
                ", jobTitle = '" + jobTitle + '\'' +
                ", salary = " + salary;
    }

    public void smokeTesting() {
        System.out.println(this.name + " is running a smoke test.");
    }

    public void createTicket() {
        System.out.println(this.name + " is creating a ticket.");
    }
}
