package classes.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
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

        Set<Integer>keys=studentsMap.keySet();
        keys.removeIf(x -> x>2);
        System.out.println(studentsMap);

        /*Iterator<Integer> it=studentsMap.keySet().iterator();
        while(it.hasNext()){
            if(it.next()>2){
                it.remove();
            }
        }
        System.out.println(studentsMap);*/

        /*System.out.println("********************");
        studentsMap.keySet().removeIf(x -> x>2);
        System.out.println(studentsMap);*/

    }
}
