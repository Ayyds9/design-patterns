package designpatterns.decorator.fastfood;

public class Egg extends Decorator {

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public int cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDec() {
        return super.getDec() + getFastFood().getDec();
    }
}
