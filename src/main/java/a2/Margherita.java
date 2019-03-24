package a2;

public class Margherita extends Pizza<PizzaType> {

    public Margherita(){
        setType(PizzaType.margherita);
        preprare();
    }

    public void preprare() {
        System.out.println("make preparation for Margherita");
        addDefaultTopping(Topping.mushrooms);
    }
}
