package a2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaSizeTest {

    @Test
    public void testGetAllSize() {
        String expect = "Small Medium Large";
        assertEquals(expect, PizzaSize.getAllSize().trim());
    }

    @Test
    public void testGetSizes() throws Exception {
        assertEquals(PizzaSize.SMALL, PizzaSize.getSizes(PizzaSize.SMALL.toString()));

    }
}