package designpatterns.component.electric;

public class Client {
    public static void main(String[] args) {
        //电器系统
        ElectricComposite root = new ElectricComposite("电器系统");

        //插座
        ElectricComposite one = new ElectricComposite("插座1");
        ElectricComposite two = new ElectricComposite("插座2");
        ElectricComposite three = new ElectricComposite("插座3");
        ElectricComposite four = new ElectricComposite("插座4");
        ElectricComposite five = new ElectricComposite("插座5");

        //电器
        Electric e1 = new Electric("电扇");
        Electric e2 = new Electric("电扇");
        Electric e3 = new Electric("电吹风");
        Electric e4 = new Electric("电脑");
        Electric e5 = new Electric("电视");

        root.add(one);
        root.add(two);
        root.add(three);
        root.add(four);
        root.add(five);

        one.add(e1);
        one.add(e2);

        two.add(e3);
        two.add(e4);

        three.add(e5);

        root.print();
    }
}
