package classes.class7;

public class WhileRecap2 {
    public static void main(String[] args) {
        int number=10;
        while (number<20){
            System.out.println(number<20);
            if(number<15){
                System.out.println("number is still less than 15");
            }else {
                System.out.println("Number is greater than 15 now");
            }
            System.out.println(number);
            number++;

        }

    }
}
