package day50_inheritance.overriding_examples;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.type = "Mammal";
        animal.name = "Dolphin";
        animal.speak();

        Dog dog = new Dog();
        dog.name = "Toplan";
        dog.type = "German Shepherd";
        dog.speak();
        dog.run();

        Cat cat = new Cat();
        cat.type = "Cats";
        cat.name = "Mastan";
        cat.speak();
        cat.jump();

    }
}
