package homeworks.homework11;

public class Task2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.

    return type => String
    parameters => String
    access modifier = static
     */

    static String reverseStr (String input){
        /*StringBuilder st = new StringBuilder(input);
        st.reverse();
        String revSt = st.toString();
        return revSt;*/

        /*
        static methods can be called by just writing the name f the class.method name
         */

        // below is a shorter way
        return new StringBuilder(input).reverse().toString();

    }

    public static void main(String[] args) {

        // if we are within the same class we don't need the class name as name
        System.out.println(reverseStr("Habibi"));
    }

}
