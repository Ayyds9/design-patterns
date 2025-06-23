package designpatterns.decorator.fastfood;

public class Bacon extends Decorator{
    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
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
