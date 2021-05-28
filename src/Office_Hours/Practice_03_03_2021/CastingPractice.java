package Office_Hours.Practice_03_03_2021;

public class CastingPractice {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;
        byte b2 = (byte)s;

        double d = 5.3;
        int i = (int)d;

        float f = 3.54F;
        float f2 = (float)3.54;
        float f3 = 5;
        float f4 = 5.5f;

        long l = 22331;
        long l1 = 936_957_692_716_595l; // underscore is like a comma here
        // long l3 = (long) 56498431646546; --> doesn't work because the number is too big for int

        System.out.println(i);
        System.out.println((double)i);
        //by default whole numbers will be read as int datatype
        //by default decimal numbers will be read as double datatype
    }
}
