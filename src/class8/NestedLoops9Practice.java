package class8;

public class NestedLoops9Practice {
    public static void main(String[] args) {

        /*
        0 1 2 3 4 5
        0 2 4 6 8 10
        0 3 6 9 12 15
         */

        for (int i = 0; i < 5; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(2*i+" ");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(3*i+" ");
        }
        System.out.println();

    }
}
