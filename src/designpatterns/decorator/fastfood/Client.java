package designpatterns.decorator.fastfood;

public class Client {
    public static void main(String[] args) {
        //点一份炒饭
        FastFood food = new FireRice();
        System.out.println(food.getDec()+" "+food.cost());
        //加鸡蛋
        food = new Egg(food);
        System.out.println(food.getDec()+" "+food.cost());
        //加培根
        food = new Bacon(food);
        System.out.println(food.getDec()+" "+food.cost());
    }
}
