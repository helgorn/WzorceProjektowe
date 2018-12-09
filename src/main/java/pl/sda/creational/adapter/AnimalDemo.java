package pl.sda.creational.adapter;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalPlanet animalPlanet = new AnimalPlanet();
        animalPlanet.makeSound(new Duck());
        MechanicalAnimalAdapter mechanicalAnimalAdapter = new MechanicalAnimalAdapter(new MechanicalDuck());
        mechanicalAnimalAdapter.makeSound();

    }
}
