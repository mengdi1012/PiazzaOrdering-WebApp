package a2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaTypeTest {

    @Test
    public void testGetAllTypes() {
        String expect = "[Pepperoni] [Margherita] [Vegetarian] [Neapolitan] [Custom]";
        assertEquals(expect, PizzaType.getAllTypes().trim());
    }

    @Test
    public void testGetType() throws Exception {
        assertEquals(PizzaType.PEPPERONI, PizzaType.getType(PizzaType.PEPPERONI.toString()));
    }

    @Test
    public void testGetAllCustomType() {
        String customTypes = PizzaType.getAllCustomType();
        assert(customTypes.contains("Cheese"));
        assert(customTypes.contains("Hawaii"));
    }
}