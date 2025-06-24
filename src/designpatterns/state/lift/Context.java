package designpatterns.state.lift;

public class Context {
    private LiftState state;

    public static final LiftState OPENING_STATE = new OpeningState();
    public static final LiftState CLOSING_STATE = new ClosingState();
    public static final LiftState RUNNING_STATE = new RunningState();
    public static final LiftState STOPPING_STATE = new StoppingState();


    public LiftState getState() {
        return state;
    }

    public void setState(LiftState state) {
        this.state = state;

        this.state.setContext(this);
    }

    public void open() {
        this.state.open();
    }

    public void close() {
        this.state.close();
    }

    public void run() {
        this.state.run();
    }

    public void stop() {
        this.state.stop();
    }
}
