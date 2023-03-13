package classes.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsDemo5 {
    public static void main(String[] args) throws FileNotFoundException {

        /*try{FileInputStream fileInputStream=new FileInputStream("");}
        catch (FileNotFoundException e){}   */

        FileInputStream fileInputStream=new FileInputStream("");
        // we throw the exception to JVM



    }
}
