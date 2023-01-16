package classes.class6;

public class WhiteLoop {
    public static void main(String[] args) {

        /*int number = 0;
        if (number<3) {
            System.out.println("Hello World");
        }

        number++;
        if(number<3){
            System.out.println("Hello World");
        }

        number++;
        if(number<3){
            System.out.println("Hello World");
        }*/

        int number2=0;
        while (number2<3){ //keeps on checking the condition as long as it returns true
            System.out.println("Hello World");
            number2++; // without this line, the code will run indefinitely
        }


    }
}
