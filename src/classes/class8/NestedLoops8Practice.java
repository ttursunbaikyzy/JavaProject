package classes.class8;

public class NestedLoops8Practice {
    public static void main(String[] args) {

        /*
        0 1 2 3 4 5
        1 2 3 4 5
        2 3 4 5
         */

        for (int i=0; i < 3; i++) {

            for (int j = 0; j < 6; j++) {

                if (i==1) {
                    if (j!=0)
                    System.out.print(j+" ");
                    continue;
                }

                if (i==2) {
                    if (j!=0 && j!=1)
                        System.out.print(j+" ");
                    continue;
                }

                System.out.print(j+" ");

            }

            System.out.println();

        }
    }
}
