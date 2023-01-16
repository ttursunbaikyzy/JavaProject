package homework.homework5;

public class Task6 {
    public static void main(String[] args) {
        /* Print the following pattern:
         *

         *

         *
         **
         *
         **
         *

         */

        for (int i = 1; i < 10; i++) {

                if (i%2!=0){
                    System.out.println("*");
                } else if (i==2 || i==4) {
                    System.out.println(" ");
                } else {
                    System.out.println("**");
                }
        }


    }
}
