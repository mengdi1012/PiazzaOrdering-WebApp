package a2;

public enum Drink {
    COKE("Coke"),DIETCOKE("Diet Coke"), COKEZERO("Coke Zero"), PEPSI("Pepsi"), DIETPEPSO("Diet Pepsi"), PEPPER("Dr. Pepper"),
    WATER("Water"), JUICE("Juice");

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
        StringBuilder sb = new StringBuilder();
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
