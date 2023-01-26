package classes.class14;

public class ArrayMachine {
    public static void main(String[] args) {

        int[] arr2 = {10, 10, 10, 20, 30};
        addArrayElementsMachine(arr2);

        int [] arr3 = {20,20,40,40};
        addArrayElementsMachine(arr3);

    }

        static void addArrayElementsMachine(int [] arr){
            int sum=0;
            for (int number: arr){
                sum+=number;
            }
            System.out.println(sum);

        }

    }