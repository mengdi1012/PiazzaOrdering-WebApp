package a2;

import java.io.*;
import java.util.*;

public class Menu {
    private static Menu menuInstance;

    private Map<String, Float> menu;

    private Menu() {
        this.menu = new HashMap<String, Float>();
        File menuFile = new File("src/main/java/a2/menu.csv");
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new FileReader(menuFile));
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        String line = "";
        try {
            while ((line = br.readLine()) != null)
            {
                String[] token = line.split(",");
                this.menu.put(token[0].toLowerCase(), Float.valueOf(token[1]));
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static Menu getMenuInstance(){
        if(menuInstance == null){
            menuInstance = new Menu();
        }
        return menuInstance;
    }

    public Float getPrice(String name){
        return this.menu.get(name.toLowerCase());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Float> item: this.menu.entrySet()){
            sb.append(item.getKey() + " " + item.getValue().toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
