package designpatterns.state.lift;

public abstract class LiftState {
    //环境角色类
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();

}
