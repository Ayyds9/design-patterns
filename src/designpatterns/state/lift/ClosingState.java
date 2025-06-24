package designpatterns.state.lift;

public class ClosingState extends LiftState {
    @Override
    public void open() {
        super.context.setState(Context.OPENING_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("Lift is already closed.");
    }

    @Override
    public void run() {
        super.context.setState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
        super.context.setState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
