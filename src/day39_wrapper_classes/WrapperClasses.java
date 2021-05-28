package day39_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("num = " + num);
        num += 10;
        System.out.println(num);
        System.out.println(num + 300);

        Integer n = new Integer (500);
        System.out.println("Is n 500? " + n.equals(500));
        System.out.println(n + 300);

        Integer n2 = 1000;
        System.out.println(n2 / 50);

        String str = "hello";
        String numSt = n2 + "";
        String numStr = n2.toString();

        System.out.println("numStr = " + numStr);
        System.out.println("numSt = " + numSt);

        Byte b1 = new Byte ((byte) 5);
        Byte b2 = 10;

        Short sh1 = new Short((short) 40);
        Short sh2 = 50;

        Integer i1 = new Integer(100);
        Integer i2 = 200;

        Long l1 = new Long(100l);
        Long l2 = 400l;

        Float fl1 = new Float(2.5f);
        Float fl2 = 3.5f;

        Double d1 = new Double(32582.5);
        Double d2 = 134.2;

        Character ch1 = new Character('F');
        Character ch2 = 'H';

        Boolean bl1 = new Boolean(true);
        Boolean bl2 = false;

    }
}
