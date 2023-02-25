package homeworks.homework19;

import java.util.Iterator;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a Set collection in which you need to add names of the countries.
        In this set we want all objects to be sorted in alphabetical order.
        Using 2 different ways retrieve all elements from set.
         */
        TreeSet<String> cities=new TreeSet<>();
        cities.add("Houston");
        cities.add("Vienna");
        cities.add("Chicago");
        cities.add("San Francisco");
        cities.add("Austin");
        cities.add("Dallas");

        System.out.println(cities);
        System.out.println("***************************");

        for(String c:cities){
            System.out.println(c);
        }
        System.out.println("***************************");

        Iterator<String> it=cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
