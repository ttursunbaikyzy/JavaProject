package classes.class9;

public class ArraysDemo {
    public static void main(String[] args) {

        String name1="Tami";
        String name2="Sam";
        String name3="Slava";
        String name4="Sardar";
        String name5="Diana";

        System.out.println(name2);

        String [] names={"Tami", "Sam", "Slava", "Sardar", "Diana"};  // first name always start from 0, so Tami is stored under 0

        System.out.println(names[1]);

        for (int i = 0; i<=6; i++) {
            System.out.println(names[i]);
        }

    }
}
