package designpatterns.decorator.dish;

public class MaPoDouFu extends Dish {
    public MaPoDouFu() {
        super("麻婆豆腐", 15.0);
    }

    @Override
    public double cost() {
        return super.getPrice();
    }

    @Override
    public String des() {
        return super.getName();
    }
}
