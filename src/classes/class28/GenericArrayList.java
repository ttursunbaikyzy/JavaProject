package classes.class28;

import classes.class11.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {

        // ArrayList<String>=new ArrayList<>();

        // below is a non-generic array list, not a good practice (old way of coding)
        Object a = new String("some value");
        Object b = new Integer(10);
        Object c=new Scanner(System.in);

        // no one now uses the arrays like this
        // non-generic - there were no diamond operators in Java
        ArrayList name=new ArrayList<>();
        name.add("Zafar");
        name.add(10);
        name.add('a');
        name.add(new Dog());

        for (Object j:name){
            System.out.println(j);
            // (j.toString();  run time error
            // ((String)j).trim();  run time error
        }


    }
}
