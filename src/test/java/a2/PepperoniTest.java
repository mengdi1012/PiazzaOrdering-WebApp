package a2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PepperoniTest {

    @Test
    public void testPrepare() {
        Pepperoni pepperoni = new Pepperoni();
        assert(pepperoni.getType().equals(PizzaType.PEPPERONI));
        assert(pepperoni.getDefaultToppings()).contains(Topping.PEPPERON);
    }
}