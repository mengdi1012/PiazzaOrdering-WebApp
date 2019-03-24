package a2;

import java.util.List;

public class Pricer {
    private Menu menu;

    public Pricer(Menu menu) {
        this.menu = menu;
    }

    public float getTotalPrice(Order order){
        float amount = 0;
        List<Pizza> pizzas = order.getpizzas();
        List<Drink> drinks = order.getDrinks();
        amount = getPizzasPrice(pizzas) + getDrinksPrice(drinks);
        return amount;
    }

    private float getDrinksPrice(List<Drink> drinks){
        float amount = 0;
        for(Drink drink : drinks){
            amount += this.menu.getPrice(drink.toString());
        }
        return amount;
    }

    private float getPizzasPrice(List<Pizza> pizzas){
        float amount = 0;
        for(Pizza pizza: pizzas){
            PizzaSize size = pizza.getSize();
            String type = pizza.getType().toString();
            List<Topping> toppings = pizza.getExtraToppings();
            amount += this.menu.getPrice(size.toString() + " " + type.toString());
            for(Topping topping: toppings){
                amount += this.menu.getPrice(topping.toString());
            }
        }
        return amount;
    }
}
