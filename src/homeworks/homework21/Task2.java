package homeworks.homework21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class Task2 {

    public static List<Exception> displayExceptions() {
        List<Exception> listOfExceptions = new LinkedList<>();

        try {
            System.out.println(10/0);
        } catch (ArithmeticException ae) {
            System.out.println(ae+" : cannot divide by 0");
            listOfExceptions.add(ae);
        }
        try {
            String str = null;
            str.length();
        } catch (NullPointerException npe) {
            System.out.println(npe+" : cannot access a method on a null object");
            listOfExceptions.add(npe);
        }
        try {
            String str="Java";
            str.charAt(10);
        } catch (StringIndexOutOfBoundsException se) {
            System.out.println(se+" : trying to access a character that doesn't exist in the given String");
            listOfExceptions.add(se);
        }
        try {
            FileInputStream fileInputStream=new FileInputStream("");
        } catch (FileNotFoundException fe){
            System.out.println(fe+" : file cannot be found due to incorrect/missing path");
            listOfExceptions.add(fe);
        }
        return listOfExceptions;
    }

    public static void main(String[] args) {
        /*
        2) Create a static method that will return a List of Exceptions.
        Inside your method create objects of 4 exception classes using
        try and catch blocks and store them inside your list.
        Call your method inside main and print name and details of all
        Exception objects.
         */

        displayExceptions();

    }
}
