package class6;

public class WhileLoop7 {
    public static void main(String[] args) {

        int number = 0;
        while (number<10){

            if (number%2==0) {   // formula for even number, if divided by two and remainder is 0 then it's even
                System.out.println("Even "+number);
            }
            number++;

        }

    }
}
