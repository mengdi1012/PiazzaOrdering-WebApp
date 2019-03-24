package a2;

public enum Drink {
    coke("Coke"),dietcoke("Diet Coke"), Cokezero("Coke Zero"), pepsi("Pepsi"), dietpepsi("Diet Pepsi"), pepper("Dr. Pepper"),
    water("Water"), juice("Juice");

    private final String drink;
    private Drink(String drink)
    {
        this.drink=drink;
    }

    @Override
    public String toString()
    {
        return drink;
    }

    public static String getAllDrinks(){
        StringBuffer sb = new StringBuffer();
        for(Drink drink: Drink.values()){
            sb.append("[" + drink.toString() + "]");
            sb.append(" ");
        }
        return sb.toString();
    }

    public static Drink getDrink(String inputDrink) throws Exception {
        for(Drink drink: Drink.values()){
            if(drink.toString().equalsIgnoreCase(inputDrink)){
                return drink;
            }
        }
        throw new Exception("Drink not found: " + inputDrink);
    }
}
