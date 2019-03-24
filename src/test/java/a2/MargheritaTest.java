package a2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MargheritaTest {

    @Test
    public void testPrepare() {
        Margherita margherita = new Margherita();
        assert(margherita.getType().equals(PizzaType.MARGHERITA));
        assert(margherita.getDefaultToppings()).contains(Topping.MUSHROOMS);
    }
}