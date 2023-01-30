package homeworks.homework9;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        // How would you check if String is palindrome or not? aba=> true
        //Abbc =>false

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter a String: ");
        String str = scan.nextLine();
        String rev = "";

        for (int i = str.length()-1; i>=0; i--) {
            rev+= str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println(str+" is palindrome");
        } else {
            System.out.println(str+" is not palindrome");
        }





    }
}
