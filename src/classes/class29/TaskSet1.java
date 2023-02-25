package classes.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class TaskSet1 {
    public static void main(String[] args) {

        /*
        Create a Set collection in which you need to add names of the countries.
        In this set we want all objects to be sorted in alphabetical order.
        Using 2 different ways retrieve all elements from set.
         */

        TreeSet<String> countries=new TreeSet<>();
        countries.add("USA");
        countries.add("Canada");
        countries.add("Mexico");
        countries.add("Egypt");
        countries.add("Indonesia");
        countries.add("Italy");

        System.out.println(countries);
        for (String s:countries){
            System.out.println(s);
        }

    }
}
