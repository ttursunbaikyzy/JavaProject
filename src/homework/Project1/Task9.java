package homework.Project1;

public class Task9 {
    public static void main(String[] args) {

        // Maximum and minimum number in the array?

        int [] numbers = {2,8,10,6,15};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min){
                min=numbers[i];
            }

            if(numbers[i] > max){
                max=numbers[i];
            }
        }

        System.out.println("The minimum number is "+min);
        System.out.println("The maximum number is "+max);


    }
}
