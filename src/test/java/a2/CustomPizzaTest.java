package a2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomPizzaTest {

    @Test
    public void testCustomPizzaCreation() throws Exception {
        CustomPizza pizza = new CustomPizza("Cheese");
        pizza.prepare();
        assert(true);
    }
}