package classes.class16;

public class TernaryOperator {
    public static void main(String[] args) {

        int number=0;
        /*if (3>2){
            number=10;
        } else {
            number=20;
        }
        System.out.println(number);*/

        // same as below
        number=(3>2)?10:20; // shorter way of writing if else conditions
        number=(3>2)?(4>5)?15:65:20;
        System.out.println(number);



    }
}
