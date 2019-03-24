package a2;

public class Pepperoni extends Pizza<PizzaType> {

    public Pepperoni(){

        setType(PizzaType.PEPPERONI);
        preprare();
    }

    public void preprare() {
        System.out.println("make preparation for Pepperoni");
        addDefaultTopping(Topping.PEPPERON);
    }
}
