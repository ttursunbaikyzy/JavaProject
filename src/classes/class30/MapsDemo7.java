package classes.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsDemo7 {
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

        Set<Entry<Integer,String>> entrySet=studentsMap.entrySet();

        for(Entry<Integer,String> entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        entrySet.removeIf(x-> x.getKey()>2 && x.getValue().contains("i"));
        System.out.println(studentsMap);

    }
}
