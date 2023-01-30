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
        StringBuilder st = new StringBuilder(input);
        st.reverse();
        String revSt = st.toString();
        return revSt;

    }

    public static void main(String[] args) {
        System.out.println(reverseStr("Habibi"));
    }

}
