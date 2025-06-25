package designpatterns.decorator.dish;

public class Salt extends Decorator {
    public Salt(Dish dish) {
        super(dish,1, "盐");
    }
    @Override
    public double cost() {
        return 2+super.getDishPrice();
    }

    @Override
    public String des() {
        return "加盐的"+super.getDishName();
    }
}
