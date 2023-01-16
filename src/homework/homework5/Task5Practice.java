package homework.homework5;

public class Task5Practice {
    public static void main(String[] args) {
        /* Print the following pattern:
            55555
            4444
            333
            22
            1
         */

        for (int i = 5; i >= 1; i--) {
            System.out.print("5");
        }
        System.out.println();
        
        for (int i = 4; i >= 1; i--) {
            System.out.print("4");
        }
        System.out.println();

        for (int i = 3; i >= 1; i--) {
            System.out.print("3");
        }
        System.out.println();

        for (int i = 2; i >= 1; i--) {
            System.out.print("2");
        }
        System.out.println();

        for (int i = 1; i >= 1; i--) {
            System.out.print("1");
        }

    }
}
