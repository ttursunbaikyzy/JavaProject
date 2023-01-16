package classes.class3;

public class IfElse_8 {
    public static void main(String[] args) {

        int age=17;
        System.out.println(age<18); // true

        // if the age less than 18, print: time to play
        if(age<18){
            System.out.println("Time to play");
        }

        boolean inSyntaxBootCamp=true; // if false, the print command will not execute

        /* If conditions work based on boolean true or false
        if we have a true inside the if () it executes all the code inside {}
        if it is false it doesn't execute any code inside {}
         */

        if(inSyntaxBootCamp){
            System.out.println("Time to start practicing java");
        }


    }
}
