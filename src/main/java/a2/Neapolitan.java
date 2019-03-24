package a2;

public class Neapolitan extends Pizza<PizzaType> {

    public Neapolitan(){
        setType(PizzaType.NEAPOLITAN);
        prepare();
    }

    public void prepare() {
        System.out.println("make preparation for Neapolitan");
        addDefaultTopping(Topping.JALAPENOS);
    }
}
