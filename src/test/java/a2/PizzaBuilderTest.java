package a2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PizzaBuilderTest {
    @Test
    public void testPizzaCreation() throws Exception {
        PizzaType type = PizzaType.PEPPERONI;
        PizzaSize size = PizzaSize.SMALL;
        List<Topping> toppings = new ArrayList<Topping>();
        toppings.add(Topping.OLIVES);
        Pizza newPizza = new PizzaBuilder().type(type.toString()).size(size).toppings(toppings).build();
        assertEquals(newPizza.getType(), type);
        assertEquals(newPizza.getSize(), size);
        assertEquals(newPizza.getExtraToppings(), toppings);
    }
}