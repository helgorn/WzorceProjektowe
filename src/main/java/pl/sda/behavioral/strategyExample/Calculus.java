package pl.sda.behavioral.strategyExample;

public class Calculus {
    private int current;
    private Agregator agregator;

    public Calculus(Agregator agregator) {
        this.agregator = agregator;
    }

    public void execute(int number){
        current=agregator.execute(current,number);
    }

    public void setAgregator(Agregator agregator) {
        this.agregator = agregator;
    }

    public int getCurrent() {
        return current;
    }
}
