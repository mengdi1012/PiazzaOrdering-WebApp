package a2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PizzaBuilderTest {
    @Test
    public void testPizzaCreation() throws Exception {
        List<Topping> toppings = new ArrayList<Topping>();
        toppings.add(Topping.OLIVES);
        Pizza newPizza = new PizzaBuilder().type(PizzaType.PEPPERONI.toString()).size(PizzaSize.SMALL).toppings(toppings).build();
    }
}