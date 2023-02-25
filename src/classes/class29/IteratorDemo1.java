package classes.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {

        ArrayList<Double> numbers=new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.2);
        numbers.add(20.0);
        numbers.add(30.5);
        numbers.add(40.5);
        numbers.add(10.3);

        /*numbers.remove(40.5);
        System.out.println(numbers);*/

        /*for(Double number:numbers){
            if (number>11){
                numbers.remove(number);
            }
        }    same as below:  */

        // numbers.removeIf(number -> number > 11);   -lambda

        Iterator<Double> it=numbers.iterator();

        /*System.out.println(it.hasNext());
        System.out.println(it.next());*/
        // hasNext() keeps on returning true as long as there are elements left to be iterated

        while(it.hasNext()){
            double number= it.next();
            if (number>11){
                it.remove();
            }
        }
        System.out.println(numbers);

    }
}
