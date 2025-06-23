package designpatterns.decorator.fastfood;

public abstract class FastFood {
    private int price;
    private String dec;

    public FastFood() {}
    public FastFood(int price, String dec) {
        this.price = price;
        this.dec = dec;
    }

    public abstract int cost();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }
}
