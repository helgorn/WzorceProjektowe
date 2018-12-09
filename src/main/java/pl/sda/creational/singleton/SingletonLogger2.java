package pl.sda.creational.singleton;

public enum SingletonLogger2 {
    INSTANCE;

    public static void log(String message){
        System.out.println(message);
    }
}
