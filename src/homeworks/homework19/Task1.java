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
        TreeSet<String> countries=new TreeSet<>();
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Canada");
        countries.add("Italy");
        countries.add("Egypt");
        countries.add("Indonesia");

        System.out.println(countries);
        System.out.println("***************************");

        for(String c:countries){
            System.out.println(c);
        }
        System.out.println("***************************");

        Iterator<String> it=countries.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
