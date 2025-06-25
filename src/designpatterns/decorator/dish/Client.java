package designpatterns.decorator.dish;

public class Client {
    public static void main(String[] args) {
        Dish dish = new MaPoDouFu();

        System.out.println(dish.des()+"价格："+dish.cost());
        System.out.println("---------------------");
        //加盐
        dish = new Salt(dish);

        System.out.println(dish.des()+"价格："+dish.cost());
        System.out.println("---------------------");
        //加盐加酱油
        dish = new JiangYou(dish);

        System.out.println(dish.des()+"价格："+dish.cost());
        System.out.println("---------------------");

    }
}
