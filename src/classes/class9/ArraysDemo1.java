package classes.class9;

public class ArraysDemo1 {
    public static void main(String[] args) {

        String [] names={"Tami", "Sam", "Slava", "Sardar", "Diana", "Rania"};  // first name always start from 0, so Tami is stored under 0

        System.out.println(names.length);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
