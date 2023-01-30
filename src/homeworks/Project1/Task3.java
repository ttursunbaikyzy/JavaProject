package homeworks.Project1;

public class Task3 {
    public static void main(String[] args) {

        // Create a 2D array of integer values. Print the sum of all numbers.

        int [][] numbers = {{2, 5, 7, 8, 10},
                            {15, 17, 22, 23, 25}
        };

        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum+=numbers[i][j];
            }
        }
        System.out.println("The sum is "+sum);

    }
}
