package homeworks.homework18;

import java.util.ArrayList;
import java.util.Iterator;

public class Task5 {
    public static void main(String[] args) {
        /*
        Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
         */

        ArrayList<Integer> numbers=new ArrayList<>();

        for (int i = 1; i <= 500; i++) {
            if(i%2==0){
                if(i%5==0){
                    continue;
                } else {
                    numbers.add(i);
                }
            }
        }
        System.out.println(numbers);

    }
}
