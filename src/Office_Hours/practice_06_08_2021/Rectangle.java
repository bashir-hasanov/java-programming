package Office_Hours.practice_06_08_2021;

public class Rectangle extends Shape {
    double width;
    double length;

    @Override
    public void calculateArea() {
        area = length * width;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * (length + width);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
