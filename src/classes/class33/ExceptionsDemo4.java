package classes.class33;

import java.io.FileNotFoundException;

public class ExceptionsDemo4 {
    public static void main(String[] args) throws FileNotFoundException {

        /*String path=null;
        FileInputStream fileInputStream=new FileInputStream(path);*/

        String name="abeera";
        if(name.length()<8){
            throw new LazyException("Lazy person found");
        }


    }
}
