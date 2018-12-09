package pl.sda.behavioral.strategyExample;

public class SumAgregator implements Agregator{

    @Override
    public int execute(int current, int number) {
        return current + number;
    }
}
