package homework.homework8;

import java.util.Scanner;

public class Task3ReDo {
    public static void main(String[] args) {

        /*
        Write a program that reads two people's first
        names and if they expecting boy or girl?
        Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter mom’s first name");
        String momName= scan.nextLine().toUpperCase();
        System.out.println("Please enter dad’s first name");
        String dadName= scan.nextLine().toUpperCase();
        System.out.println("Are you expecting boy or girl");
        String baby=scan.nextLine();
        String firstHalf=" ";
        String secondHalf=" ";

        if(baby.equalsIgnoreCase("boy")) {
            firstHalf=dadName.substring(0,dadName.length()/2);
            secondHalf=momName.substring(momName.length()/2);
        } else {
            firstHalf=momName.substring(0,momName.length()/2);
            secondHalf=dadName.substring(dadName.length()/2);
        }
        System.out.println(firstHalf+secondHalf);
    }
}
