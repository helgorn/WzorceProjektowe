package pl.sda.creational.builder;

import java.time.LocalDate;

public class BuiderDemo {

    public static void main(String[] args){
        Customer customer = new Customer.Builder("Michal","Rusiecki")
                .born(LocalDate.of(1990, 5, 7))
                .withPesel("90050705376")
                .workingAs("Kursant")
                .livingInCity("Szczecin")
                .livingInCountry("Poland")
                .build();
        System.out.println(customer);

        Customer customer1 = Customer.createDefault();
        System.out.println(customer1);

        Customer customer2 = Customer.createEmpty();
        System.out.println(customer2);

        Customer customer3 = Customer.create("ala","mala").build();
        System.out.println(customer3);
    }
}
