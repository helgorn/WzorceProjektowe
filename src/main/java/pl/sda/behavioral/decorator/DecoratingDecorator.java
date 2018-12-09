package pl.sda.behavioral.decorator;

import pl.sda.creational.singleton.SingletonLogger;

public class DecoratingDecorator extends Calculator{

    private final Calculator calculator;

    public DecoratingDecorator(Calculator calculator){
        this.calculator=calculator;
    }

    @Override
    public int add(int a, int b) {
        SingletonLogger.getInstance().log("Start");
        int score = calculator.add(a,b);
        SingletonLogger.getInstance().log(String.format("%d + %d = %d",a,b,score));
        SingletonLogger.getInstance().log("Stop");
        return score;
    }
}
