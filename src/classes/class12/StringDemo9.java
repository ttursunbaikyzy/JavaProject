package classes.class12;

public class StringDemo9 {
    public static void main(String[] args) {

        String str="geszgees 3654545 ^%^@#";

        /*int counter=0;
        for (int i = 0; i < str.length(); i++) {

            if(Character.isAlphabetic(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("Total Alphabetic in Str "+counter);*/


        /*int counter=0;
        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("Total Digits in Str "+counter);*/

        int counter=0;
        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("Total Digits in Str "+counter);

        // Character.isSpaceChar();



    }
}
