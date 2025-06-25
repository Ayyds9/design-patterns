package designpatterns.observe.mail;

public interface MailSubject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(String message);
}
