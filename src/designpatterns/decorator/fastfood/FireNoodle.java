package designpatterns.decorator.fastfood;

public class FireNoodle extends FastFood{

    public FireNoodle() {
        super(12,"炒面");
    }
    @Override
    public int cost() {
        return getPrice();
    }
}
