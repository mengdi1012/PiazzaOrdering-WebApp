package a2;

public class Margherita extends Pizza<PizzaType> {

    public Margherita(){
        setType(PizzaType.MARGHERITA);
        prepare();
    }

    public void prepare() {
        System.out.println("make preparation for Margherita");
        addDefaultTopping(Topping.MUSHROOMS);
    }
}
