package homeworks.homework10;

public class Task5InClass {
    // Write a method to return whether given number is prime or not
    /*
    return type => boolean
    name => isPrime
    parameters => int
     */
    boolean isPrime (int number){
        boolean flag=true;
        if (number>1){
            for (int i = 2; i < number; i++) {
                if (number%i==0){
                    flag=false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        return flag;

    }


    public static void main(String[] args) {
        Task5InClass num = new Task5InClass();
        System.out.println(num.isPrime(5));
    }


}
