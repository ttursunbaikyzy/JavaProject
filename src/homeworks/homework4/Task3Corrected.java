package homeworks.homework4;

public class Task3Corrected {
    public static void main(String[] args) {

        // Print even numbers from 20 to 1 (2 ways)

        for (int i=20; i>=1; i--) {
            if (i%2==0) {
                System.out.println(i);
            }
        }

        System.out.println("******************");

        for (int i=20; i>=1; i-=2) {
                System.out.println(i);
        }

    }
}
