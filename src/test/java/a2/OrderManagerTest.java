package a2;

import org.junit.Test;
import org.junit.Before;


import static org.junit.Assert.*;

public class OrderManagerTest {
    OrderManager orderManager;
    Pizza newPizza;
    @Before
    public void setUp() {
        orderManager = OrderManager.getOrderManager();
        newPizza = new PizzaBuilder().type(PizzaType.PEPPERONI.toString()).size(PizzaSize.SMALL).toppings(null).build();
    }

    @Test
    public void testGetOrderManager() {
        OrderManager anotherOrderManager = OrderManager.getOrderManager();
        assertEquals(orderManager,anotherOrderManager);
    }

    @Test
    public void testCreateNewOrder() {
        Order newOrder = orderManager.getOrderBuilder().pizzas(pizzas).drinks(drinks).build();
        orderManager.createNewOrder(newOrder);


    }
}