package homeworks.homework20;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        /*
        3)Create a Map that will store Employee name and salary.
        Write a logic to retrieve an employees who gets the highest salary.
        Output should be in the below format
        John Smith=$100000
         */

        Map<String,Integer> employees=new HashMap<>();
        employees.put("Sam",200000);
        employees.put("Tami",250000);
        employees.put("Niko",150000);
        employees.put("John",300000);
        employees.put("Jimmy",100000);

        var employee=employees.entrySet();
        int highest=0;
        String emp="";
        for(var e:employee){
            if(e.getValue()>highest){
                highest=e.getValue();
                emp=e.getKey();
            }
        }
        System.out.println(emp+"=$"+highest);



    }
}
