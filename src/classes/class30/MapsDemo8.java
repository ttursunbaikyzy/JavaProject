package classes.class30;

import java.util.*;

public class MapsDemo8 {
    public static void main(String[] args) {
        /*
        Create a countryMap of countries with its capital that will store countries in alphabetical order.
        Print all keys and values from a country countryMap using for each loop and iterator.
         */

        Map<String,String> countryMap=new TreeMap<>();
        countryMap.put("USA","Washington DC");
        countryMap.put("Canada","Ottawa");
        countryMap.put("Mexico","Mexico City");
        countryMap.put("Egypt","Cairo");
        countryMap.put("Italy","Rome");

        // Set<Entry<String, String>> entrySet=countryMap.entrySet();
        var entrySet=countryMap.entrySet();

        // for(Map.Entry<String,String> entry:entrySet){
        for(var entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("********************************");
        /*Iterator<Entry<String, String>> it=entrySet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

        var iterator=countryMap.entrySet().iterator();
        while (iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("********************************");
        System.out.println(countryMap);




    }
}
