package classes.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class SetsDemo6 {
    public static void main(String[] args) {

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        // How can you remove all duplicates from ArrayList?
        // Write some logic to remove duplicates from above list

        LinkedHashSet<String> bList=new LinkedHashSet<>(aList);
        System.out.println(bList);

    }
}
