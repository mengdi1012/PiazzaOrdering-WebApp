package a2;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza<T> {
    private T type;
    private PizzaSize size;
    private List<Topping> defaultToppings = new ArrayList<Topping>();
    private List<Topping> extraToppings = new ArrayList<Topping>();


    public T getType() {
        return type;
    }

    public void setType(T type) {
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

    @Override
    public String toString() {
        StringBuilder toppingPrint = new StringBuilder();
        for(Topping topping: this.defaultToppings){
            toppingPrint.append(topping.toString());
            toppingPrint.append(" ");
        }
        for(Topping topping: this.extraToppings){
            toppingPrint.append(topping.toString());
            toppingPrint.append(" ");
        }
        return "Pizza{" +
                "type=" + type +
                ", size=" + size +
                ", toppings =" + toppingPrint.toString() +
                '}';
    }
}
