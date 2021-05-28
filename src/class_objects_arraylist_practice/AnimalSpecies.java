package class_objects_arraylist_practice;

public class AnimalSpecies {
    String name;
    int population;
    int growthRate;

    public void setInfo(String newName, int newPopulation, int newGrowthRate) {
        name = newName;
        population = newPopulation;
        growthRate = newGrowthRate;
    }

    public String getName() {
        if (name == null) {
            return "No name defined";
        }
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getGrowthRate() {
        return growthRate;
    }

    @Override
    public String toString() {
        return "Animal Species: " +
                "name = '" + name + '\'' +
                ", population = " + population + " million" +
                ", growthRate = " + growthRate + "%";
    }
}
