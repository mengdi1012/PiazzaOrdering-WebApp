package a2;

public class Vegetarian extends Pizza {

    public Vegetarian(){

        setType(PizzaType.vegetarian);
        preprare();
    }

    public void preprare() {
        System.out.println("make preparation for Vegetarian");
        addDefaultTopping(Topping.olives);
        addDefaultTopping(Topping.tomatoes);
    }
}
