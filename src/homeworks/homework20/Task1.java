package homeworks.homework20;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        /*
        1) Create a map of Best Buy store. Place item id and item name into it.
        Example (7664847 = Printer, 7879885= TV etc )
        Retrieve all keys and values from a Best Buy map using EntrySet.
         */

        Map<Integer,String> bestBuy=new HashMap<>();
        bestBuy.put(7664847,"Printer");
        bestBuy.put(7879855,"TV");
        bestBuy.put(564684125,"Laptop");
        bestBuy.put(46388452,"Headphones");
        bestBuy.put(54144841,"Phone");

        var entrySet=bestBuy.entrySet();

        for(var entry:entrySet){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }


    }
}
