package designpatterns.decorator.dish;

public class YuXiangQieZi extends Dish {
    public YuXiangQieZi() {
        super("鱼香茄子", 12.0);
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
