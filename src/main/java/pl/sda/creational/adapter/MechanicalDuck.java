package pl.sda.creational.adapter;

public class MechanicalDuck implements IMechanicalAnimal {
    @Override
    public void doMechanicalSound() {
        System.out.println("quack quack");
    }
}
