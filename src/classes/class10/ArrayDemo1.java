package classes.class10;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int [] arr={10,20,30,40,50};
        // can we print two numbers from an array?
        System.out.println(arr[4]+" "+arr[2]);
        // print all the elements from this array using a loop

        System.out.println("**********************");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("**********************");

        // Enhanced/foreach for loop
        // whenever possible use loop below

        for (int number: arr){
            System.out.println(number);
        }

    }
}
