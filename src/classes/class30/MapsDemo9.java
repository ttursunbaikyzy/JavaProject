package classes.class30;

import java.util.Map;
import java.util.TreeMap;

public class MapsDemo9 {
    public static void main(String[] args) {
        /*
        Create a countryMap of countries with its capital that will store countries in alphabetical order.
        Print all values from a country countryMap using for each loop and iterator.
         */

        Map<String,String> countryMap=new TreeMap<>();
        countryMap.put("USA","Washington DC");
        countryMap.put("Canada","Ottawa");
        countryMap.put("Mexico","Mexico City");
        countryMap.put("Egypt","Cairo");
        countryMap.put("Italy","Rome");

        var values=countryMap.values();
        for(var value:values){
            System.out.println(value);
        }

        System.out.println("****************************");
        var iterator=countryMap.values().iterator();
        while(iterator.hasNext()){
            var value=iterator.next();
            System.out.println(value);
        }


    }
}
