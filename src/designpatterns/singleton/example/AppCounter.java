package designpatterns.singleton.example;

public class AppCounter {
    private int counter = 0;

    private AppCounter() {}

    private static class AppCounterHolder {
        private static final AppCounter INSTANCE = new AppCounter();
    }

    public static AppCounter getInstance() {
        return AppCounterHolder.INSTANCE;
    }

    public int getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
    }

    public void decrement() {
        counter--;
    }

}
