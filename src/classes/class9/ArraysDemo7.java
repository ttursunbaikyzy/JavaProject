package classes.class9;

public class ArraysDemo7 {
    public static void main(String[] args) {

        // create empty array, store 10,20,30,4,5,6,7,80
        // add all the element which are multiple of 2


        int [] numbers={10,20,30,4,5,6,7,80};

        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0) {
                sum+=numbers[i];
            }
        }
        System.out.println(sum);


    }
}
