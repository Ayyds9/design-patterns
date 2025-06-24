package designpatterns.state.lift;

public class RunningState extends LiftState{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("Lift is already running.");
    }

    @Override
    public void stop() {
        super.context.setState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
