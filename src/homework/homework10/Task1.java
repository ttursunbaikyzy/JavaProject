package homework.homework10;

public class Task1 {

    // Create a method that will take 2 parameters as a numbers and prints which number is larger.

    int largerNum (int a, int b){

        if (a > b){
            return a;
        } else {
            return b;
        }

    }

    public static void main(String[] args) {

        Task1 mp = new Task1();
        System.out.println(mp.largerNum(5, 10));

    }

}
