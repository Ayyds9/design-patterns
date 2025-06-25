package designpatterns.decorator.dish;

public class JiangYou extends Decorator {
    public JiangYou(Dish dish) {
        super(dish,2, "酱油");
    }

    @Override
    public double cost() {
        return 2 + super.getDishPrice();
    }

    @Override
    public String des() {
        return "加酱油的"  + super.getDishName();
    }
}
