package class8;

public class NestedLoops6Rectangle {
    public static void main(String[] args) {

        for (int i=0; i < 4; i++) {

            if (i==1 || i==2){
                System.out.println("*         *");
                continue;
            }

            for (int j = 0; j < 6; j++) {

                System.out.print("* ");

            }

            System.out.println();

        }
    }
}
