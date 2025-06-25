package designpatterns.strateg.promoteexample;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private double price;
    private List<String> products = new ArrayList<>();

    public Order(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }
}
