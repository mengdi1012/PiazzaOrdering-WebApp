package a2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ToppingTest {

    @Test
    public void testGetAllToppings() {
        String expect = "[Olives] [Tomatoes] [Mushrooms] [Jalapenos] [Chicken] [Beef] [Pepperon]";
        assertEquals(expect, Topping.getAllToppings().trim());
    }

    @Test
    public void testGetTopping() throws Exception {
        assertEquals(Topping.OLIVES, Topping.getTopping(Topping.OLIVES.toString()));

    }
}