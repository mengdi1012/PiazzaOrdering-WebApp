package a2;

public class Vegetarian extends Pizza<PizzaType> {

    public Vegetarian(){

        setType(PizzaType.VEGETARIAN);
        prepare();
    }

    public void prepare() {
        System.out.println("make preparation for Vegetarian");
        addDefaultTopping(Topping.OLIVES);
        addDefaultTopping(Topping.TOMATOES);
    }
}
