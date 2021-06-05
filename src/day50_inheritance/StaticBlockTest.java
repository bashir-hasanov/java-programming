package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo stb1 = new StaticBlockDemo(); // static block will run, 1 time only before everything else
        StaticBlockDemo stb2 = new StaticBlockDemo(); // for the second time static block will not run
        StaticBlockDemo stb3 = new StaticBlockDemo();
        System.out.println(StaticBlockDemo.num);
        System.out.println(StaticBlockDemo.carModels);

        StaticBlockDemo stb4 = new StaticBlockDemo(50);
    }
}
