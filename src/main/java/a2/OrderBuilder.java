package a2;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private int orderNumber;
    private List<Pizza> pizzas;
    private List<Drink> drinks;

    public OrderBuilder(int orderNumber) {

        this.orderNumber = orderNumber;
        this.pizzas = new ArrayList<Pizza>();
        this.drinks = new ArrayList<Drink>();
    }

    public OrderBuilder pizzas(List<Pizza> pizzas) {

        this.pizzas = pizzas;
        return this;
    }

    public OrderBuilder drinks(List<Drink> drinks){
        this.drinks = drinks;
        return this;
    }

    public Order build(){
        Order newOrder = new Order(this.orderNumber);
        newOrder.setpizza(this.pizzas);
        newOrder.setDrinks(this.drinks);
        return newOrder;
    }
}
