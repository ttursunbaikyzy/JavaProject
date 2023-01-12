package homework3;

public class Task13 {
    public static void main(String[] args) {
        // Print even numbers from 20 to 1 (2 ways)

        int number = 20;

        while (number >= 1) {
            if (number%2==0) {
                System.out.println(number);
            }
            number--;
        }

        while (number <= 20 ) {
            if (number%2==0 && number!=0) {
                System.out.println(number);
            }
            number++;
        }


    }
}
