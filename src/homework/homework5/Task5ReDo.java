package homework.homework5;

public class Task5ReDo {
    public static void main(String[] args) {
        /* Print the following pattern:
            1
            22
            333
            4444
            55555
         */

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }


    }
}
