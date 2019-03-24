package a2;

import java.io.*;

public class CustomPizza extends Pizza<String> {

    public CustomPizza(String customType) throws Exception {
        setType(customType);
        File file = new File("src/main/java/a2/custom_recipe/" + this.getType());
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = "";
        while ((line = br.readLine()) != null)
        {
            String[] toppings = line.split(",");
            for(String topping: toppings) {
                addDefaultTopping(Topping.getTopping(topping.trim()));
            }
        }
        preprare();
    }

    public void preprare() { ;
        System.out.println("make preparation for " + this.getType());
    }
}
