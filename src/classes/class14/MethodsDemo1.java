package classes.class14;

import java.util.Arrays;

public class MethodsDemo1 {
    public static void main(String[] args) {

        int [] arr1 = {10,20,30,45,50};

        int sum = 0;
        for (int number:arr1){
            sum+=number;
        }
        System.out.println(sum);
        // System.out.println(Arrays.toString(arr1));


        /*for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }*/

        int [] arr2={10,10,10,20,30};

        int sum2 = 0;
        for (int number2:arr2){
            sum2+=number2;
        }
        System.out.println(sum2);


        int [] arr3={10,10,10,20,30};

        sum2 = 0;
        for (int number2:arr3){
            sum2+=number2;
        }
        System.out.println(sum2);


    }
}
