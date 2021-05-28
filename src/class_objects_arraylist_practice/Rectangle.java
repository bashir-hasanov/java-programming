package class_objects_arraylist_practice;

public class Rectangle {
    double width, height, area;

    public void setDimensions(double widthValue, double heightValue) {
        width = widthValue;
        height = heightValue;
        area = width * height;
    }

    public int getArea() {
        return (int) area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area +
                '}';
    }
}
