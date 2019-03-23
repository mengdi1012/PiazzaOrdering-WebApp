package a2;

public enum PizzaSize {
    six("6 inch"), ten("10 inch"),twelve("12 inch");

    private final String size;
    private PizzaSize(String size)
    {
        this.size = size;
    }

    @Override
    public String toString()
    {
        return size;
    }
}
