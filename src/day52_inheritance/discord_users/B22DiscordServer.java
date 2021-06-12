package day52_inheritance.discord_users;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1234);
        user1.setName("Suleyman");
        user1.setRole("Student");

        Admin admin1 = new Admin();
        admin1.setId(43145);
        admin1.setName("Burak Kara");
        admin1.setRole("Admin");

        System.out.println(user1);
        System.out.println(admin1);

        Admin admin2 = new Admin("Gulia", 3489);
        System.out.println(admin2.toString());
    }
}
