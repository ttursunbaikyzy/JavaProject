package homeworks.homework20;

import java.util.Collection;
import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        /*
        Create a collection of integers in which you can keep duplicates.
        Write a logic to find sum of all integers
         */

        Collection<Integer> numbers=new LinkedList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(22);
        numbers.add(10);
        numbers.add(5);

        int sum=0;
        for(Integer num:numbers){
            sum+=num;
        }
        System.out.println("The sum is "+sum);

    }
}
