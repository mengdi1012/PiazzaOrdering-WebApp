package a2;

import org.junit.Test;

import static org.junit.Assert.*;

public class DrinkTest {

    @Test
    public void testGetAllDrinks() {
        String expect = "[Coke] [Diet Coke] [Coke Zero] [Pepsi] [Diet Pepsi] [Dr. Pepper] [Water] [Juice]";
        assertEquals(expect, Drink.getAllDrinks().trim());
    }

    @Test
    public void getDrink() throws Exception {
        assertEquals(Drink.COKE, Drink.getDrink(Drink.COKE.toString()));
    }
}