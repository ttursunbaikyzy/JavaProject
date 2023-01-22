package homework.Project1;

public class Task4 {
    public static void main(String[] args) {

        //Create a 2D array of integer type where you will store odd and even numbers.
        //Develop a program which will identify/print the even numbers only.

        int [][] numbers = {{2, 5, 7, 8, 10},
                            {15, 17, 22, 23, 25}
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    System.out.println(numbers[i][j]);
                }
            }
        }


    }
}
