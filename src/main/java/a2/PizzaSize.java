package a2;

public enum PizzaSize {
    small("Small"), medium("Medium"),large("Large");

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

    public static String getAllSize(){
        StringBuffer sb = new StringBuffer();
        for(PizzaSize size: PizzaSize.values()){
            sb.append(size.toString());
            sb.append(" ");
        }
        return sb.toString();
    }

    public static PizzaSize getSizes(String inputSize) throws Exception {
        for(PizzaSize size: PizzaSize.values()){
            if(size.toString().equalsIgnoreCase(inputSize)){
                return size;
            }
        }
        throw new Exception("Size not found: " + inputSize);
    }
}
