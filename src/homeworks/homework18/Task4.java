package homeworks.homework18;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
         */
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("cocktail");
        drinks.add("juice");
        drinks.add("beer");

        for (int i = 0; i < drinks.size(); i++) {
            String drink=drinks.get(i);
            if(drink.contains("a") || drink.contains("e")){
                drinks.set(i,"water");
            }
        }
        System.out.println(drinks);
    }
}
