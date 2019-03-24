package a2;

import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PricerTest {

    float pizzaPrice;
    float drinkPrice;
    int orderNumber;

    @Before
    public void setUp() throws Exception {
        OrderManager orderManager = OrderManager.getOrderManager()
        List<Pizza> pizzas = new ArrayList<Pizza>();
        PizzaType type = PizzaType.PEPPERONI;
        PizzaSize size = PizzaSize.MEDIUM;
        List<Topping> toppings = new ArrayList<Topping>();
        toppings.add(Topping.OLIVES);
        toppings.add(Topping.TOMATOES);
        Pizza pepperoniPizza = new PizzaBuilder().type(type.toString()).size(size).toppings(toppings).build();
        pizzas.add(new Vegetarian());
        pizzas.add(pepperoniPizza);
        List<Drink> drinks = new ArrayList<Drink>();
        drinks.add(Drink.COKE);
        drinks.add(Drink.JUICE);

        orderNumber = orderManager.getOrderBuilder().pizzas(pizzas).drinks(drinks).build().getOrderNumber();


        Menu menu = new Menu();
        Pricer price = new Pricer(Menu);

        pizzaPrice = getPizzasPrice(pizzas);
        drinkPrice = getDrinkPrice(drinks);


    }

    @Test
    public void testGtTotalPrice() {
        Pricer price = new Pricer();
        assertEquals(pizzaPrice+drinkPrice,price.getTotalPrice(orderNumber));
    }
}