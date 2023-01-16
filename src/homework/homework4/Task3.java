package homework.homework4;

public class Task3 {
    public static void main(String[] args) {

        // Print even numbers from 20 to 1 (front and backwards)

        for (int i=20; i>=1; i--) {
            if (i%2==0) {
                System.out.println(i);
            }
        }

        System.out.println("******************");

        for (int i=1; i<=20; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

    }
}
