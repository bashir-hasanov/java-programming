package day52_inheritance;

public class MobileAppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.name = "YouTube";
        mobileApp.useTheApp(10);
        mobileApp.download();
        System.out.println("----------------------------");

        Instagram instagram = new Instagram();
        instagram.name = "Instagram";
        instagram.useTheApp(20);
        instagram.download();
        System.out.println("----------------------------");

        Discord b22Discord = new Discord();
        b22Discord.name = "Discord";
        b22Discord.useTheApp(100);
        b22Discord.download();
    }

}
