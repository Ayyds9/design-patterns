package designpatterns.observe.mail;

import java.util.Observable;

public class User implements Observer {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + "接收到了通知：" + message);
    }
}
