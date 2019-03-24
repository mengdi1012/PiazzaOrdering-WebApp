package a2;

import org.junit.Test;

import static org.junit.Assert.*;

public class VegetarianTest {

    @Test
    public void testPreprare() {
        Vegetarian vegetarian = new Vegetarian();
        assert(vegetarian.getType().equals(PizzaType.VEGETARIAN));
        assert(vegetarian.getDefaultToppings().contains(Topping.OLIVES));
        assert(vegetarian.getDefaultToppings().contains(Topping.TOMATOES));

    }
}