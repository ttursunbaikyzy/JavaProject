package classes.class29;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsDemo3 {
    public static void main(String[] args) {

        // Does not allow duplicates and sets the insertion in alphabetical order
        TreeSet<String> fruit=new  TreeSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Mango");
        fruit.add("Apple");
        System.out.println(fruit);

        // Does not allow duplicates and sets the insertion in ascending order
        TreeSet<Integer> numbers=new  TreeSet<>();
        numbers.add(50);
        numbers.add(40);
        numbers.add(100);
        numbers.add(20);
        numbers.add(35);
        numbers.add(50);
        System.out.println(numbers);

    }
}
