package homeworks.homework3;

public class Task14Corrected {
    public static void main(String[] args) {
        // Print odd numbers between 20 and 50 (2 ways)

        int number = 20;

        while (number <= 50) {
            if (number%2==1) {
                System.out.println(number);
            }
            number++;
        }

        System.out.println("*********************");

        int number2 = 20;

        while (number2 <= 50 ) {
            number2++;
            System.out.println(number2++);
        }



    }
}
