package class6;

public class WhileLoopPractice {
    public static void main(String[] args) {

        // write a loop to print numbers from 1 to 100
        // write a loop to print odd numbers from 1 to 15
        // write a loop to print these number 5, 10, 15, 20, 25, 30......50

        int number = 1;
        while (number<=100) {
            System.out.println(number);
            number++;
        }

        System.out.println("*****************");

        int oddNumber = 1;
        while (oddNumber<=15){
            System.out.println(oddNumber);
            oddNumber+=2;
        }

        System.out.println("****************");

        int number2=5;
        while (number2<=50){
            System.out.println(number2);
            number2+=5;
        }
    }
}
