package day52_inheritance;

public class MobileAppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("YouTube");
        mobileApp.setVersion(8.0);
        mobileApp.useTheApp(10);
        mobileApp.download();
        System.out.println("----------------------------");

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.setVersion(8.523);
        instagram.useTheApp(20);
        instagram.download();
        System.out.println("----------------------------");

        Discord b22Discord = new Discord();
        b22Discord.setName("Discord");
        b22Discord.setVersion(9.214);
        b22Discord.useTheApp(100);
        b22Discord.download();
        b22Discord.printInfo();
    }

}
