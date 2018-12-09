package pl.sda.behavioral.strategyExample;

public class MinusAgregator implements Agregator {
    @Override
    public int execute(int current, int number) {
        return current-number;
    }
}
