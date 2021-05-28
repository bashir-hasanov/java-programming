package class_objects_arraylist_practice;

public class Earth {
    public static void main(String[] args) {
        AnimalSpecies animalOne = new AnimalSpecies();
        animalOne.setInfo("Dog", 900, 3 );
        System.out.println("Animal 1 name = " + animalOne.getName());
        System.out.println("Animal 1 population = " + animalOne.getPopulation() + " million");
        System.out.println("Animal 1 growth rate = " + animalOne.getGrowthRate() + " %");
        System.out.println(animalOne.toString());

        AnimalSpecies animalTwo = new AnimalSpecies();
        animalTwo.setInfo("Cat", 373, 4);
        System.out.println("Animal 2 name = " + animalTwo.getName());
        System.out.println("Animal 2 population = " + animalTwo.getPopulation() + " million");
        System.out.println("Animal 2 growth rate = " + animalTwo.getGrowthRate() + " %");
        System.out.println(animalTwo.toString());

        AnimalSpecies animalThree = new AnimalSpecies();
        animalThree.setInfo("Kangaroo", 27, 2);
        System.out.println("Animal 3 name = " + animalThree.getName());
        System.out.println("Animal 3 population = " + animalThree.getPopulation() + " million");
        System.out.println("Animal 3 growth rate = " + animalThree.getGrowthRate() + " %");
        System.out.println(animalThree.toString());
    }
}
