package designpatterns.decorator.dish;

public abstract class Decorator extends Dish {
    private Dish dish;
    public Decorator(Dish dish,double price,String name) {
        super(name, price);
        this.dish = dish;
    }
    public double getDishPrice() {
        return dish.cost();
    }
    public String getDishName() {
        return dish.des();
    }

}
