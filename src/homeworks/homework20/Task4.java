package homeworks.homework20;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Task4 {
    public static void main(String[] args) {
        /*
        4)Create the collection that will store single uniques Objects of a String type in which order is preserved.
        Write a logic to concatenate all string from the collection.
         */
        Collection<String>uniqueObjects=new LinkedHashSet<>();
        uniqueObjects.add("Moon");
        uniqueObjects.add("Earth");
        uniqueObjects.add("Stars");
        uniqueObjects.add("Sun");
        uniqueObjects.add("Sky");

        for(String objects:uniqueObjects){
            System.out.print(objects+" ");
        }
    }
}
