package a2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder{
    private PizzaSize size;
    private String type;
    private List<Topping> toppings = new ArrayList<Topping>();

    public PizzaBuilder() {
    }

    public PizzaBuilder size(PizzaSize size){
        this.size = size;
        return this;
    }

    public PizzaBuilder type(String type){
        this.type = type;
        return this;
    }

    public PizzaBuilder toppings(List<Topping> toppings){
        this.toppings = toppings;
        return this;
    }

    public Pizza build() throws Exception {
        if(this.size == null){
            throw new RuntimeException("size is not given");
        }
        if(this.type == null){
            throw new RuntimeException("type is not given");
        }
        Pizza newpizza;
        if(PizzaType.getAllTypes().contains(this.type)){
            Class<?> clazz = Class.forName("a2." + this.type);
            newpizza = (Pizza)clazz.newInstance();
        }else{
            newpizza = new CustomPizza(this.type);
        }
        newpizza.setSize(this.size);
        newpizza.setExtraToppings(this.toppings);
        return newpizza;
    }
}
