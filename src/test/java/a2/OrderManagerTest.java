package a2;

import org.junit.Test;
import org.junit.Before;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OrderManagerTest {
    OrderManager orderManager;
    @Before
    public void setUp() {
        orderManager = OrderManager.getOrderManager(); }

    @Test
    public void testGetOrderManager() {
        OrderManager anotherOrderManager = OrderManager.getOrderManager();
        assertEquals(orderManager,anotherOrderManager);
    }

    @Test
    public void testCreateNewOrder() throws Exception {
        List<Pizza> pizzas = new ArrayList<Pizza>();
        pizzas.add(new Vegetarian());
        List<Drink> drinks = new ArrayList<Drink>();
        drinks.add(Drink.COKE);
        Order newOrder = orderManager.getOrderBuilder().pizzas(pizzas).drinks(drinks).build();
        orderManager.createNewOrder(newOrder);
        assertEquals(orderManager.getOrder(newOrder.getOrderNumber()), newOrder);
        String expect = "{orderNumber=0, pizzas=[Pizza{type=Vegetarian, size=Small, toppings =Olives Tomatoes } ], drinks=Coke }";
        assertEquals(expect, newOrder.toString().trim());
    }
}