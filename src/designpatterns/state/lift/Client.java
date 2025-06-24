package designpatterns.state.lift;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        context.setState(Context.OPENING_STATE);
        context.open();
        context.stop();
        context.run();
        context.close();

        context.run();
        context.stop();
        context.run();
    }
}
