package a2;

public enum Topping {
    OLIVES("Olives"), TOMATOES("Tomatoes"), MUSHROOMS("Mushrooms"), JALAPENOS("Jalapenos"), CHICKEN("Chicken"), BEEF("Beef"),
    PEPPERON("Pepperon");

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

    public static String getAllToppings(){
        StringBuilder sb = new StringBuilder();
        for(Topping topping: Topping.values()){
            sb.append("["  + topping.toString() + "]");
            sb.append(" ");
        }
        return sb.toString();
    }

    public static Topping getTopping(String inputTopping) throws Exception {
        for(Topping topping: Topping.values()){
            if(topping.toString().equalsIgnoreCase(inputTopping)){
                return topping;
            }
        }
        throw new Exception("Topping not found: " + inputTopping);
    }
}
