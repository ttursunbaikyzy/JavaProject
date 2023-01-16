package classes.class8;

public class RecapDemo1 {
    public static void main(String[] args) {
        // 10 8 6 4 2
        int number=10;

        /*while(number>=2){
            System.out.println(number);
            number-=2;
        }*/

        do {
            System.out.println(number);
            number-=2;
        }while(number>=2);

    }
}
