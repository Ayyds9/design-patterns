package designpatterns.observe.mail;

public class Client {
    public static void main(String[] args) {
        MailSubject mailSubject = new MailList();
        mailSubject.registerObserver(new User("User1","123") );
        mailSubject.registerObserver(new User("User2","456") );
        mailSubject.registerObserver(new User("User3","789") );
        mailSubject.registerObserver(new User("User4","789") );

        mailSubject.notifyObservers("吃饭了");
        mailSubject.notifyObservers("快睡觉");
    }
}
