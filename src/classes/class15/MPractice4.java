package classes.class15;

public class MPractice4 {
    /*
    create a method that takes two numbers as parameters
    and return the larger number
     */
    /*
    return type => int
    name => largerNum
    parameters => int num1, int num2
     */

    int largerNum (int a, int b){

        if (a > b){
            return a;
        } else {
            return b;
        }

    }

    public static void main(String[] args) {

        MPractice4 mp = new MPractice4();
        System.out.println(mp.largerNum(5, 10));

    }

}
