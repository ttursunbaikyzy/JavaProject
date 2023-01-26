package classes.class12;

public class StringSubstring {
    public static void main(String[] args) {

        String str="Send it to support channel. More Java";
        String newStr=str.substring(28);
        System.out.println(newStr);
        // we can also specify the starting point and the ending point
        System.out.println(str.substring(0,27));



    }
}
