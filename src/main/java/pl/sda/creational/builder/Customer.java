package pl.sda.creational.builder;

import java.time.LocalDate;

public class Customer {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String pesel;
    private String profession;
    private String city;
    private String country;

    private Customer(){
    }

    public static Customer createEmpty(){
        return new Customer();
    }

    public static Builder create(String name,String lastName){
        return new Builder(name,lastName);
    }

    public static Customer createDefault(){
        Customer customer = new Customer();
        customer.name = "aaa";
        customer.lastName = "bbb";
        return customer;
    }


    public static class Builder{
        private Customer customer = new Customer();

        public Builder(String name, String lastName){
            customer.name=name;
            customer.lastName=lastName;
        }

//        public Builder withName(String name){
//            customer.name = name;
//            return this;
//        }
//
//        public Builder withLastName(String lastName){
//            customer.lastName = lastName;
//            return this;
//        }

        public Builder born(LocalDate birthDate){
            customer.birthDate = birthDate;
            return this;
        }

        public Builder withPesel(String pesel){
            customer.pesel = pesel;
            return this;
        }

        public Builder workingAs(String profesion){
            customer.profession = profesion;
            return this;
        }

        public Builder livingInCity(String city){
            customer.city = city;
            return this;
        }

        public Builder livingInCountry(String country){
            customer.country = country;
            return this;
        }

        public Customer build(){
            return customer;
        }

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", pesel='" + pesel + '\'' +
                ", profession='" + profession + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
