package designpatterns.strateg.promoteexample;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void ContextShow(Order order) {
        strategy.promote(order);
    }

}
