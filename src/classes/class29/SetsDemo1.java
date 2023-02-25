package classes.class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class SetsDemo1 {
    public static void main(String[] args) {

        //HashSet does not allow duplicate values and it does not maintain insertion order (speed: fast)
        HashSet<String> fruit=new HashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango"); // won't print because duplicate
        System.out.println(fruit);

    }
}
