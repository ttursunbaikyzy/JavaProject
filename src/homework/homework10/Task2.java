package homework.homework10;

public class Task2 {

   String EvenOrOdd(int a) {

        String even = "Even number";
        String odd = "Odd number";

        if (a%2==0) {
            return even;
        } else {
            return odd;
        }
    }


    public static void main(String[] args) {
        Task2 num = new Task2();

        System.out.println(num.EvenOrOdd(10));

    }


}
