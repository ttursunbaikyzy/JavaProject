package class7;

public class ForLoopPractice {
    public static void main(String[] args) {

        // using a for loop print odd numbers from 1 to 20;

        for (int i=1; i<=20; i++){
            if (i%2==1) {
                System.out.println(i);
            }
        }

        System.out.println("************************");
        for (int i=1; i<20; i+=2){
            System.out.println(i);
        }

    }
}
