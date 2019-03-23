package a2;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    private PizzaType type;
    private PizzaSize size;
    private List<Topping> defaultToppings = new ArrayList<Topping>();
    private List<Topping> extraToppings = new ArrayList<Topping>();


    public PizzaType getType() {
        return type;
    }

    public void setType(PizzaType type) {
        this.type = type;
    }

    public PizzaSize getSize() {

        return size;
    }

    public void setSize(PizzaSize size) {

        this.size = size;
    }

    public List<Topping> getDefaultToppings() {

        return this.defaultToppings;
    }

    public List<Topping> getExtraToppings() {

        return this.extraToppings;
    }

    public void addDefaultTopping(Topping topping) {
        this.defaultToppings.add(topping);
    }

    public void setExtraToppings(List<Topping> extraToppings) {
        this.extraToppings = extraToppings;
    }

    public abstract void preprare();
}
