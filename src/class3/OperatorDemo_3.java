package class3;

public class OperatorDemo_3 {
    public static void main(String[] args) {
        int number=10;
        System.out.println(number/3); // 3
        System.out.println(number%3); // remainder 1

        System.out.println(16/5); // 3
        System.out.println(16%5); // remainder 1

        System.out.println(156%2); // even
        System.out.println(155%2); // odd
        /*
        we always take the modulus by 2 if the answer is, it's an even number
        otherwise it's an odd number
         */

        System.out.println(1555%5); // if 0, it means divisible by 5
    }
}
