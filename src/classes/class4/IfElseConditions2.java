package classes.class4;

public class IfElseConditions2 {
    public static void main(String[] args) {

        boolean rain=false;

        if(rain){
            System.out.println("Let's take the umbrella"); // Plan A
        }else{
            System.out.println("Let's just take the hat"); // Plan B
        }

        /* create a boolean variable call it breakTime if it contains true
        print let's take the break otherwise it should print lets continue with the class
         */

        boolean breakTime=true;

        if(breakTime){
            System.out.println("Let's take the break");
        }else{
            System.out.println("Let's continue with the class");
        }

    }
}
