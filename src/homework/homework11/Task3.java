package homework.homework11;

public class Task3 {
    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.

    return type => String
    parameters => String
    access modifier = private
     */

    private String vowels (String input){
        return input.replaceAll("[^aeiouy]", "");
    }

    public static void main(String[] args) {
        Task3 newStr = new Task3();
        System.out.println(newStr.vowels("I love coding in Java"));
    }
}
