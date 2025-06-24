package designpatterns.state.lift;

public class OpeningState extends LiftState{

    @Override
    public void open() {
        System.out.println("Lift is already open.");
    }

    @Override
    public void close() {
        super.context.setState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
