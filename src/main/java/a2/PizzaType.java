package a2;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public enum PizzaType {
    PEPPERONI("Pepperoni"), MARGHERITA("Margherita"), VEGETARIAN("Vegetarian"), NEAPOLITAN("Neapolitan"), CUSTOM("Custom");

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

    public static String getAllTypes(){
        StringBuffer sb = new StringBuffer();
        for(PizzaType type: PizzaType.values()){
            sb.append("["  + type.toString() + "]" );
            sb.append(" ");
        }
        return sb.toString();
    }

    public static PizzaType getType(String inputType) throws Exception {
        for(PizzaType type: PizzaType.values()){
            if(type.toString().equalsIgnoreCase(inputType)){
                return type;
            }
        }
        throw new Exception("Type not found: " + inputType);
    }

    public static String getAllCustomType() {
        StringBuffer sb = new StringBuffer();
        // create new file
        File f = new File("src/main/java/a2/CUSTOM_recipe");
        // returns pathnames for files and directory
        File[] paths = f.listFiles();

        // for each pathname in pathname array
        for (File path : paths) {
            // prints file and directory paths
            String typeName = path.getName();
            sb.append("[" + typeName + "]");
            sb.append(" ");
        }
    return sb.toString();
    }
}
