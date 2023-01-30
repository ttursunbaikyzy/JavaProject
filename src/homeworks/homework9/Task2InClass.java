package homeworks.homework9;

public class Task2InClass {
    public static void main(String[] args) {

        /*
        Create a String that should be combination of letters, numbers and special characters.
        Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */

        String str="fejwafjJJFIaEJG15LKJEfhdgxjbbngKTG;SEKDzzV64541321%^&^^#$*(*&)";

        System.out.println(str.replaceAll("[^A-Za-z0-9]","").length());

    }
}
