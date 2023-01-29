package homework.homework10;

public class Task5 {
    // Write a method to return whether given number is prime or not
    String isPrime (int a){
        int count=0;

        for (int i = 1; i <= a ; i++) {
            if (a%i==0) {
                count++;
            }
        }

        if(count==2) {
            return "The given number is Prime";
        } else {
            return "The given number is Not Prime";
        }

    }


    public static void main(String[] args) {
        Task5 num = new Task5();
        System.out.println(num.isPrime(5));
    }


}
