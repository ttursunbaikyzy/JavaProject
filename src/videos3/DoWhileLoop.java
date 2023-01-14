package videos3;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n;

        do {
            System.out.println("Enter a number between 1 and 10: ");
            n=s.nextInt();
        } while (n<1 || n>10);

        System.out.println(n+" is between 1 and 10");
    }
}
