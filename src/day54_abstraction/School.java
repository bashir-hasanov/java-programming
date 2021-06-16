package day54_abstraction;

public class School {
    public static void main(String[] args) {
        Student onlineStudent = new OnlineStudent();
        onlineStudent.code("Java");
        onlineStudent.attendClass();

        Student campusStudent = new CampusStudent();
        campusStudent.code("Javascript");
        campusStudent.attendClass();

    }
}
