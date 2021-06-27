package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        // create List of Shapes and store 10 different shapes
        // using a loop print out each shape
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(new Triangle());
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(new Triangle());

        for (Shape each : shapes) {
            each.draw();
        }

        drawShape(new Circle());
        drawShape(new Square());
        drawShape(new Triangle());

    }

    public static void drawShape(Shape shape) {
        System.out.println("-----Drawing Shape-----");
        shape.draw();
    }
}
