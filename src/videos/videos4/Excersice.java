package videos.videos4;

public class Excersice {
    public static void main(String[] args) {
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6

        A
        A B
        A B C

        $ $ $ $
        $     $
        $     $
        $ $ $ $

         */

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("*****************");

        for (int i = 1; i < 4; i++) {
            int alphabet=65;
            for (int j = 1; j <= i; j++) {
                System.out.print((char)alphabet+" ");
                alphabet++;
                }
            System.out.println();
            }

        System.out.println("*****************");

        for (int i = 0; i < 4; i++) {
            if (i==1 || i==2){
                System.out.println("$       $");
                continue;
            }

            for (int j = 0; j <= 4; j++) {
                    System.out.print("$ ");
            }

            System.out.println();
        }


        }
    }
