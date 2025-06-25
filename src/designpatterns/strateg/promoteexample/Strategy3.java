package designpatterns.strateg.promoteexample;

public class Strategy3 implements Strategy {
    @Override
    public void promote(Order order) {
        System.out.println("购买特定商品，赠送小礼品一个");
    }
}
