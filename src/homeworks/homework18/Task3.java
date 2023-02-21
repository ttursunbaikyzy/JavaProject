package homeworks.homework18;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create an arrayList of words. Remove every word that ends with “e”.
         */

        ArrayList<String>words=new ArrayList<>();
        words.add("hello");
        words.add("hi");
        words.add("bye");
        words.add("goodbye");
        words.add("ciao");

        Iterator<String>iterator=words.iterator();
        while(iterator.hasNext()){
            String s= iterator.next();
            if(s.endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);

    }
}
