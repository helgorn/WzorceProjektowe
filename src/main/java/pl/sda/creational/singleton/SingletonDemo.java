package pl.sda.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonLogger.getInstance().log("TEST");
        SingletonLogger2.INSTANCE.log("TEST2");
    }
}
