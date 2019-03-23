package a2;

public enum Topping {
    olives("Olives"), tomatoes("Tomatoes"), mushrooms("Mushrooms"), jalapenos("Jalapenos"), chicken("Chicken"), beef("Beef"),
    pepperon("Pepperon");

    private final String topping;
    private Topping(String topping)
    {
        this.topping=topping;
    }

    @Override
    public String toString()
    {
        return topping;
    }
}
