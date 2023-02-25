package homeworks.homework19;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a Set of cities in which you want to make sure that insertion order is maintained.
        Then remove any city that starts with “A”;
         */
        TreeSet<String> cities=new TreeSet<>();
        cities.add("Houston");
        cities.add("Vienna");
        cities.add("Chicago");
        cities.add("San Francisco");
        cities.add("Austin");
        cities.add("Dallas");

        cities.removeIf(x -> x.startsWith("A"));
        System.out.println(cities);
    }
}
