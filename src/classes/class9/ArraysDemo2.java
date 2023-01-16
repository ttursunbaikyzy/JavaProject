package classes.class9;

public class ArraysDemo2 {
    public static void main(String[] args) {

        int [] numbers={10, 20, 30, 45, 50};

        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            sum+=numbers[i];
        }
        System.out.println(sum);

    }
}
