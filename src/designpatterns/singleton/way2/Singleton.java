package designpatterns.singleton.way2;

public class Singleton {
    private static Singleton instance;
    static
    {
        instance = new Singleton();
    }
    private Singleton() {}

    public static Singleton getInstance(){
        return instance;
    }
}
