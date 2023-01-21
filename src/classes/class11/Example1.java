package classes.class11;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {

        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };

        // write Enhanced for loop to print all the elements from this 2D array

        /*
        for(int [] numbers: matrix){
            System.out.println(Arrays.toString(numbers));
        }
        */

        // foreach loop to print all the numbers from a 2D array
        for (int [] arr: matrix){

            for (int number:arr){
                System.out.print(number+" ");
            }
            System.out.println();
        }


    }
}
