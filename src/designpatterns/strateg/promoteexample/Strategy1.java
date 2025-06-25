package designpatterns.strateg.promoteexample;

public class Strategy1 implements Strategy{
    @Override
    public void promote(Order order) {
        if (order.getPrice() >= 200) {
            System.out.println("满200元打8折" + "，实付金额：" +order.getPrice() * 0.8);
        }else {
            System.out.println("无折扣" + "，实付金额：" +order.getPrice());
        }
    }
}
