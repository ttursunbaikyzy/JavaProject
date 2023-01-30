package homeworks.Project1;

import java.util.Scanner;

public class Task2WhileLoop {
    public static void main(String[] args) {

        /*
        Using Scanner create an array of countries. When an array is created,
        retrieve all values from it and while retrieving those values print capital
        for each country. (use 2 different loops).
         */

        Scanner scan=new Scanner(System.in);

        String [] countries = new String [5];

        System.out.println("Please enter five counties");
        countries[0]=scan.nextLine();
        countries[1]=scan.nextLine();
        countries[2]=scan.nextLine();
        countries[3]=scan.nextLine();
        countries[4]=scan.nextLine();

        int i = 0;
        while (i< countries.length){
            if(countries[i].equals("USA")){
                System.out.println("The capital is Washington DC");
            } else if (countries[i].equals("Egypt")) {
                System.out.println("The capital is Cairo");
            } else if (countries[i].equals("Ukraine")){
                System.out.println("The capital is Kiev");
            } else if (countries[i].equals("Kyrgyzstan")) {
                System.out.println("The capital is Bishkek");
            } else if (countries[i].equals("Malaysia")) {
                System.out.println("The capital is Kuala Lumpur");
            } else {
                System.out.println("Invalid");
            }
            i++;
        }

    }
}
