package homework2;

public class EvenOdd {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = num1%2;

        if (num2==0) {
            System.out.println(num1+" is an even number");
        } else if (num2==1) {
            System.out.println(num1+ " is an odd number");
        }
    }
}
