package homeworks.homework19;

import java.util.LinkedHashSet;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a Set of cities in which you want to make sure that insertion order is maintained.
        Then remove any city that starts with “A”;
         */
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Houston");
        cities.add("Vienna");
        cities.add("Chicago");
        cities.add("San Francisco");
        cities.add("Austin");
        cities.add("Dallas");

        cities.removeIf(x -> x.startsWith("A") || x.startsWith("a"));
        System.out.println(cities);
    }
}
