package homework2;

public class EvenOddNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = num1%2;

        if (num2==0) {
            System.out.println(num1+" is an even number");
        } else {
            System.out.println(num1+ " is an odd number");
        }
    }
}
