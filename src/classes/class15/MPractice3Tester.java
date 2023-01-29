package classes.class15;

public class MPractice3Tester {
    public static void main(String[] args) {

        /* to call a method:
        create the object of the class that has the method
        objectname.methodname
         */

        MPractice3 mp = new MPractice3();
        System.out.println(mp.arraySum(new int [] {10, 20, 30}));

        int [] arr = {10, 20, 30};
        System.out.println(mp.arraySum(arr));



    }
}