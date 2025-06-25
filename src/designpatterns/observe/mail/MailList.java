package designpatterns.observe.mail;

import java.util.ArrayList;
import java.util.List;

public class MailList implements MailSubject{
    private List<User> users = new ArrayList<User>();

    @Override
    public void registerObserver(Observer observer) {
        users.add((User) observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        users.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (User user : users) {
            user.update("message: " + message);
        }
    }
}
