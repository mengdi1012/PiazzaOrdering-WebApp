package a2;

public enum PizzaType {
    pepperoni("Pepperoni"), margherita("Margherita"), vegetarian("Vegetarian"), neapolitan("Neapolitan");

    private final String type;
    private PizzaType(String type)
    {
        this.type=type;
    }

    @Override
    public String toString()
    {
        return type;
    }
}
