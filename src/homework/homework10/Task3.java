package homework.homework10;

public class Task3 {
    // Create a method that will print whether given String is palindrome or not.

    String palindrome (String str){
        String rev = "";

        for (int i = str.length()-1; i>=0; i--) {
            rev+= str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev)){
            return "Given string is palindrome";
        } else {
            return "Given string is not palindrome";
        }
    }

    public static void main(String[] args) {
        Task3 newStr = new Task3();

        System.out.println(newStr.palindrome("Madam"));
    }


}
