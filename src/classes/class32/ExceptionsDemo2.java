package classes.class32;

import classes.Utils.ExcelReader;

import java.io.IOException;

public class ExceptionsDemo2 {
    public static void main(String[] args) throws IOException {
        //System.out.println(10/0);
        //int[] arr={10,20,30};
        //System.out.println(arr[5]);
        //String name=null;
        //System.out.println(name.length());
        //int[] arr=new int[-5];

        /*try {
            ExcelReader.read();
        } catch (Exception e) {
            System.out.println(e);
        }*/

        // ExcelReader.read();
        test();
    }

    static void test() throws IOException {
        /*try {
            ExcelReader.read();
        } catch (Exception e) {
            System.out.println(e);
        }*/
        ExcelReader.read();
    }
}
