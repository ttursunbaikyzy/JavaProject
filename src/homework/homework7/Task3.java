package homework.homework7;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        // Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        //Retrieve all values from that array using 2 different loops

        String [][] groceries = {{"tomatoes", "onions", "potatoes"},
                            {"apples", "bananas", "pears"},
                            {"milk", "yogurt", "creamer"},
                            {"sneakers", "danish", "cake"}
        };

        for (int i = 0; i < groceries.length; i++) {
            for (int j = 0; j < groceries[i].length; j++) {
                System.out.println(groceries[i][j]+" ");
            }
        }

        System.out.println("************************************");

        for (String [] groceryList: groceries) {
            System.out.println(Arrays.toString(groceryList)+" ");
        }

    }
}
