package homework.homework11;

public class Task1Static {
    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.

                            instance is same as object

    return type => int
    name=> sumArrayElements
    parameters => int [] arr
    access modifier = default
     */

    static int sum (int [] arr) {
        int sum = 0;
        for (int num:arr){
                sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr={10,25,35,45};
        System.out.println(sum(arr));
    }

}
