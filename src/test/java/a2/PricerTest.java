package a2;

import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PricerTest {

    Menu menu ;
    Pricer pricer;
    Order newOrder;

    @Before
    public void setUp() throws Exception {
        menu = Menu.getMenuInstance();
        pricer = new Pricer(menu);
        OrderManager orderManager = OrderManager.getOrderManager();
        List<Pizza> pizzas = new ArrayList<Pizza>();
        pizzas.add(new Vegetarian());
        List<Drink> drinks = new ArrayList<Drink>();
        drinks.add(Drink.COKE);
        newOrder = orderManager.getOrderBuilder().pizzas(pizzas).drinks(drinks).build();
    }

    @Test
    public void testGtTotalPrice() {
        float pizzaPrice;
        float drinkPrice;

        Pizza pizza = newOrder.getpizzas().get(0);
        pizzaPrice = menu.getPrice(pizza.getSize() + " " + pizza.getType().toString());
        drinkPrice = menu.getPrice(Drink.COKE.toString());
        Float expectPrice = pizzaPrice + drinkPrice;
        Pricer pricer = new Pricer(menu);
        assertEquals(expectPrice, pricer.getTotalPrice(newOrder), 0.0);
    }
}