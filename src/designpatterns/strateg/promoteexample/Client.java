package designpatterns.strateg.promoteexample;

public class Client {
    public static void main(String[] args) {
        Order order = new Order(50);

        //使用策略1
        order.setPrice(200);
        Context context = new Context(new Strategy1());
        context.ContextShow(order);

        //使用策略2
        order.setPrice(300);
        context.setStrategy(new Strategy2());
        context.ContextShow(order);

        order.setPrice(500);
        context.setStrategy(new Strategy2());
        context.ContextShow(order);

        //使用策略3
        context.setStrategy(new Strategy3());
        context.ContextShow(order);
    }
}
