package pl.sda.behavioral.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(2,3);
        calculator=new Decorator(calculator);
        calculator.add(3,7);
        calculator=new DecoratingDecorator(calculator);
        calculator.add(10,2);
    }
}
