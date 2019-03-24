package a2;

public class Pepperoni extends Pizza<PizzaType> {

    public Pepperoni(){

        setType(PizzaType.PEPPERONI);
        prepare();
    }

    public void prepare() {
        System.out.println("make preparation for Pepperoni");
        addDefaultTopping(Topping.PEPPERON);
    }
}
