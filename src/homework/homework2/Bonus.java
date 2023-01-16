package homework.homework2;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of years you have worked in our company");
        int number = input.nextInt();

        System.out.println("Please enter your annual salary");
        int salary = input.nextInt();

        if (number>=5) {
            System.out.println("Employee is eligible for the bonus");
            if (salary>50000){
                System.out.println("Your bonus is 5000");
            }else {
                System.out.println("Your bonus is 3000");
            }
        }else{
            System.out.println("Employee is not eligible for the bonus");
        }
    }
}
