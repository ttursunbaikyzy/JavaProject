package homework4;

public class Task4 {
    public static void main(String[] args) {

        // Print odd numbers between 20 and 50 (2 ways)

        for (int i = 20; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        for (int i = 50; i >= 20; i--) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
