package a2;

import org.junit.Test;

import static org.junit.Assert.*;

public class NeapolitanTest {

    @Test
    public void testPrepare() {
        Neapolitan neapolitan = new Neapolitan();
        assert(neapolitan.getType().equals(PizzaType.NEAPOLITAN));
        assert(neapolitan.getDefaultToppings()).contains(Topping.JALAPENOS);
    }
}