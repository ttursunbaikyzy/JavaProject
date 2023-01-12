package homework4;

public class Task3 {
    public static void main(String[] args) {

        // Print even numbers from 20 to 1 (2 ways)

        for (int i=20; i>=1; i--) {
            if (i%2==0) {
                System.out.println(i);
            }
        }

        for (int i=1; i<=20; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }

    }
}
