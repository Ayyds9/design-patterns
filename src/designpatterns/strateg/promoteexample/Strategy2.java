package designpatterns.strateg.promoteexample;

public class Strategy2 implements Strategy {
    @Override
    public void promote(Order order) {
        if (order.getPrice() >= 300 && order.getPrice() < 500) {
            System.out.println("满300元减50，实付金额：" + (order.getPrice() - 50));
        } else {
            if (order.getPrice() >= 500) {
                System.out.println("满500元减100，实付金额：" + (order.getPrice() - 100));
            } else {
                System.out.println("无折扣" + "，实付金额：" + order.getPrice());
            }
        }
    }
}
