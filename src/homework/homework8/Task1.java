package homework.homework8;

public class Task1 {
    public static void main(String[] args) {

        /*
        Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
        For Example String str=hello =>l
         */

        String str="I love java";
        int middleChar=str.length()/2;

        if(str.length()%2!=0 && str.length()>3){
            System.out.println(str.charAt(middleChar));
        }


    }
}
