package a2;

public class Neapolitan extends Pizza {

    public Neapolitan(){
        setType(PizzaType.neapolitan);
        preprare();
    }

    public void preprare() {
        System.out.println("make preparation for Neapolitan");
        addDefaultTopping(Topping.jalapenos);
    }
}