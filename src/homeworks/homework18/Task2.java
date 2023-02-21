package homeworks.homework18;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create an arraylist of cars and retrieve all the values using 3 different ways.
         */

        ArrayList<String> cars=new ArrayList<>();
        cars.add("Hyundai");
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Range Rover");

        System.out.println(cars);
        System.out.println("****************************");

        for(String car:cars){
            System.out.print(car+" ");
        }
        System.out.println();
        System.out.println("****************************");

        Iterator<String>iterator= cars.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("****************************");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("****************************");

        int i=0;
        while(i< cars.size()){
            System.out.println(cars.get(i));
            i++;
        }

    }
}
