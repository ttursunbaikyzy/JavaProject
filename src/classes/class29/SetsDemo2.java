package classes.class29;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetsDemo2 {
    public static void main(String[] args) {

        // Does not allow duplicates and retains the insertion order
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Mango");
        fruit.add("Apple");
        System.out.println(fruit);

    }
}
