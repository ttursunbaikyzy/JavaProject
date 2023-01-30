package homeworks.homework10;

public class Task3InClass {
    // Create a method that will print whether given String is palindrome or not.
    /* return type => void
    name => palindrome
    parameters => String input str
     */

    /* My solution below:
    String isPalindrome (String str){
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if (str.equalsIgnoreCase(reversedStr)) {
            return "this string is palindrome";
        } else {
            return " is not palindrome";
        }*/
    void isPalindrome (String str){
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println(str+" is palindrome");
        } else {
            System.out.println(str+" is not palindrome");
        }

    }

    public static void main(String[] args) {
        Task3InClass newStr = new Task3InClass();
        // String result = newStr.isPalindrome("dad");  << we can't assign void methods to variables
        // System.out.println(newStr.isPalindrome("dad")); << we can't use void method in println
        newStr.isPalindrome("kaya");
    }


}
