package class_objects_arraylist_practice;

public class RectangleObjects {
    public static void main(String[] args) {
        Rectangle rectangleObjectOne = new Rectangle();
        rectangleObjectOne.setDimensions(24.5, 13.8);
        System.out.println("get area 1 = " + rectangleObjectOne.getArea());

        Rectangle rectangleObjectTwo = new Rectangle();
        rectangleObjectTwo.setDimensions(110.4, 45.3);
        System.out.println("get area 2 = " + rectangleObjectTwo.getArea());

        Rectangle rectangleObjectThree = new Rectangle();
        rectangleObjectThree.setDimensions(34.9, 205.1);
        System.out.println("get area 3 = " + rectangleObjectThree.getArea());
    }
}
