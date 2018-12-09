import pl.sda.creational.builder.Customer;
import pl.sda.creational.factory.Profession;
import pl.sda.creational.factory.Warrior;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Legolas",9000, Profession.ARCHER);
        warrior.changeProfession(Profession.SWORDSMAN);
    }
}
