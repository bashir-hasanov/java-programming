package day45_oop;

public class TrafficLightsObjects {
    public static void main(String[] args) {
        TrafficLights trafficLight = new TrafficLights();
        // trafficLight.color = "red";
        // we will assign/update the value of color using a method of the class
        trafficLight.changeColor("red");
        // System.out.println(trafficLight.color); --> direct access to variable, NOT RECOMMENDED
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        trafficLight.changeColor("yellow");
        trafficLight.showColor();

        // creating second instance/object
        TrafficLights trafficLight2 = new TrafficLights();
        trafficLight2.changeColor("brown");
        trafficLight2.showColor();

    }
}
