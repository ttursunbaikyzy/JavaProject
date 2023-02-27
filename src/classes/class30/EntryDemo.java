package classes.class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class EntryDemo {
    public static void main(String[] args) {
        Set<Entry> entrySet=new LinkedHashSet<>();
        entrySet.add(new Entry(1,"Sam"));
        entrySet.add(new Entry(2,"Tami"));
        entrySet.add(new Entry(3,"Abeera"));
        entrySet.add(new Entry(4,"Hiral"));
        entrySet.add(new Entry(5,"Wilasinee"));
        entrySet.add(new Entry(6,"Gulzhanar"));
        entrySet.add(new Entry(7,"Savo"));
        entrySet.add(new Entry(8,"Anush"));

        // remove those objects for which value of key is
        // greater than 2 and values contains the letter i

        /*Entry entry=new Entry(1,"Nezir");
        System.out.println(entry.getKey()+" "+entry.getValue());*/

        entrySet.removeIf(x -> x.getKey()>2 && x.getValue().contains("i"));
        System.out.println(entrySet);

}
}
