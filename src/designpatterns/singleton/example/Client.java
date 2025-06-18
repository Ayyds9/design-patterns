package designpatterns.singleton.example;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        AppCounter counter1 = AppCounter.getInstance();
        AppCounter counter2 = AppCounter.getInstance();
        for (int i = 0; i < 10; i++) {
            counter1.increment();
            System.out.println(counter1.getCounter());
        }

        for (int i = 0; i < 10; i++) {
            counter2.decrement();
            System.out.println(counter2.getCounter());
        }

        System.out.println(counter1 == counter2);
    }
}
