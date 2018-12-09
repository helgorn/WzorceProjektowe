package pl.sda.behavioral.strategyExample;

import java.util.Random;

public class StrategyDemo {
    public static void main(String[] args) {
        Calculus calculus = new Calculus(new SumAgregator());
        System.out.println("Dodajacy agragator");
        doIt(calculus);
        System.out.println("Odejmujacy agregator");
        calculus.setAgregator(new MinusAgregator());
        doIt(calculus);
    }

    public static void doIt(Calculus calculus){
        Random random= new Random();
        for(int i=0;i<10;i++){
            calculus.execute(random.nextInt(10));
            System.out.println(calculus.getCurrent());
        }
    }
}
