package classes.class6;

public class WhileLoop8 {
    public static void main(String[] args) {

        // Print below sequence with the help of loop
        // 1 2 3 4 6 7 8 9  11 12 13 14 16

        /*int number=1;
        while (number <=16){

            if (number==5 || number==10 | number==15){

            } else {
                System.out.println(number);
            }
            number++;
        }*/

        System.out.println("********************");

        /*int number2=1;
        while (number2<=16){

            if (number2%5==0){

            }else {
                System.out.println(number2);
            }
            number2++;
        }*/

        System.out.println("********************");

        int number2=1;
        while (number2<=16){

            if (number2%5!=0){
                System.out.println(number2);
            }
            number2++;
        }

    }
}
