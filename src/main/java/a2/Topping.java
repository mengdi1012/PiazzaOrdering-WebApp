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

    public static String getAllToppings(){
        StringBuffer sb = new StringBuffer();
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
