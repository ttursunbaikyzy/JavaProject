package classes.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo6 {
    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Sam");
        studentsMap.put(2,"Tami");
        studentsMap.put(3,"Abeera");
        studentsMap.put(4,"Hiral");
        studentsMap.put(5,"Wilasinee");
        studentsMap.put(6,"Gulzhanar");
        studentsMap.put(7,"Savo");
        studentsMap.put(8,"Anush");

        // remove all the keys from above map if they are greater than 2

        Collection<String> values=studentsMap.values();
        System.out.println(values);

        // remove all values which contain the letter i
        values.removeIf(x -> x.contains("i"));
        System.out.println(studentsMap);

        // remove the entries if key is greater than 2 and value contains the letter i

    }
}
