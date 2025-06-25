package designpatterns.decorator.dish;

public class ShuangTangYu extends Dish {
    public ShuangTangYu() {
        super("酸汤鱼", 10.0);
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
