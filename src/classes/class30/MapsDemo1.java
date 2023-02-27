package classes.class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Sam");
        studentsMap.put(2,"Tami");
        studentsMap.put(3,"Abeera");
        studentsMap.put(4,"Hiral");
        studentsMap.put(1,"Wilasinee"); // will replace Sam

        System.out.println(studentsMap);
        System.out.println(studentsMap.get(3));
        System.out.println(studentsMap.size());
        System.out.println(studentsMap.containsKey(5));
        System.out.println(studentsMap.containsValue("Sam"));
        System.out.println(studentsMap.remove(2));
        System.out.println(studentsMap);
        studentsMap.replace(3,"Asli");
        System.out.println(studentsMap);


    }
}
