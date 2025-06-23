package designpatterns.decorator.fastfood;

public abstract class Decorator extends FastFood{
    private FastFood fastFood;

    public Decorator(FastFood fastFood,int price,String dec) {
        super(price,dec);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
