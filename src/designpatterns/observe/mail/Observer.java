package designpatterns.observe.mail;

import java.util.Observable;

public interface Observer {
    public void update(String message);
}
