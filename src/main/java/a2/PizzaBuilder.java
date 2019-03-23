package a2;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder{
    private PizzaSize size;
    private PizzaType type;
    private List<Topping> toppings = new ArrayList<Topping>();

    public PizzaBuilder() {
    }

    PizzaBuilder size(PizzaSize size){
        this.size = size;
        return this;
    }

    PizzaBuilder type(PizzaType type){
        this.type = type;
        return this;
    }

    PizzaBuilder topping(Topping topping){
        this.toppings.add(topping);
        return this;
    }

    Pizza Build() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        if(this.size == null){
            throw new RuntimeException("size is not given");
        }
        if(this.type == null){
            throw new RuntimeException("type is not given");
        }
        Class<?> clazz = Class.forName(this.type.toString());
        Pizza newpizza = (Pizza)clazz.newInstance();
        newpizza.setSize(this.size);
        newpizza.setExtraToppings(this.toppings);
        newpizza.preprare();
        return newpizza;
    }
}
