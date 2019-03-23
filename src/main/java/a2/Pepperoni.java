package a2;

public class Pepperoni extends Pizza {

    public Pepperoni(){

        setType(PizzaType.pepperoni);
        preprare();
    }

    public void preprare() {
        System.out.println("make preparation for Pepperoni");
        addDefaultTopping(Topping.pepperon);
    }
}
