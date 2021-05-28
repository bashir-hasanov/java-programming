package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.type = "Lion";
        System.out.println(animal.type);
        animal.eat();
        animal.eat("grass");
        animal.speak();

        Animal bird = new Animal();
        bird.type = "Cardinal";
        System.out.println(bird.type);
        bird.eat();
        bird.eat("seeds");
        bird.speak();

        Animal cheetahObj = new Animal();
        cheetahObj.type = "Cheetah";
        System.out.println(cheetahObj.type);
        cheetahObj.eat();
        cheetahObj.eat(" raw meat");
        cheetahObj.speak();
    }
}
