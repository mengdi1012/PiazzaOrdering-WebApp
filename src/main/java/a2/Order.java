package a2;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNumber;
    private List<Pizza> pizzas;
    private List<Drink> drinks;

    public int getOrderNumber() {
        return orderNumber;
    }

    public List<Pizza> getpizzas() {
        return pizzas;
    }

    public void setpizza(List<Pizza> pizza) {
        this.pizzas = pizza;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        this.pizzas = new ArrayList<Pizza>();
        this.drinks = new ArrayList<Drink>();
    }

    @Override
    public String toString() {
        StringBuilder pizzaPrint = new StringBuilder();
        for(Pizza pizza: this.pizzas){
            pizzaPrint.append(pizza.toString());
            pizzaPrint.append(" ");
        }
        StringBuilder drinkPrint = new StringBuilder();

        for(Drink drink: this.drinks){
            drinkPrint.append(drink.toString());
            drinkPrint.append(" ");
        }

        return  "{" +
                "orderNumber=" + orderNumber +
                ", pizzas=[" + pizzaPrint +
                "], drinks=" + drinkPrint +
                "}";
    }
}
