package homework.homework4;

public class Task4Corrected {
    public static void main(String[] args) {

        // Print odd numbers between 20 and 50 (2 ways)

        for (int i = 20; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        System.out.println("**************************");

        for (int i = 20; i <= 50; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}