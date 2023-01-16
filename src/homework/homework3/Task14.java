package homework.homework3;

public class Task14 {
    public static void main(String[] args) {
        // Print odd numbers between 20 and 50 (front and backward)

        int number = 20;

        while (number <= 50) {
            if (number%2==1) {
                System.out.println(number);
            }
            number++;
        }

        number--;

        while (number >= 20 ) {
            if (number%2==1) {
                System.out.println(number);
            }
            number--;
        }


    }
}
