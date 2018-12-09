package pl.sda.creational.adapter;

public class Duck implements Animal {
    @Override
    public void makeSound() {
        System.out.println("kwa kwa");
    }
}
