package Office_Hours.practice_06_08_2021;

public class ShapeObjects {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        shape1.calculateArea();

        Square squareONe = new Square();
        squareONe.side = 5;
        squareONe.calculateArea();
        squareONe.calculatePerimeter();
        System.out.println(squareONe);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 3;
        rectangle1.length = 4;
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();
        System.out.println(rectangle1);

        Circle circle1 = new Circle();
        circle1.radius = 6;
        circle1.calculateArea();
        circle1.calculatePerimeter();
        System.out.println(circle1);
    }
}
