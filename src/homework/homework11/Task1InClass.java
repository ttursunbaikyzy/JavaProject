package homework.homework11;

public class Task1InClass {
    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.

                            instance is same as object

    return type => int
    name=> sumArrayElements
    parameters => int [] arr
    access modifier = default
     */

    int sum (int [] arr) {
        int sum = 0;
        for (int num:arr){
                sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task1InClass total = new Task1InClass();
        int[] arr={10,25,35,45};
        System.out.println(total.sum(arr));
    }

}
