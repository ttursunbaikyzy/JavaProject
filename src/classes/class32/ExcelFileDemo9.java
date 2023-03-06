package classes.class32;

import classes.Utils.ExcelReader;

import java.io.IOException;
import java.util.*;

public class ExcelFileDemo9 {
    public static void main(String[] args) throws IOException {
        List<Map<String,String>> excelData= ExcelReader.read();
        //excelData.get(0);
        //Map<String,String> firstRow=excelData.get(1);
        //System.out.println(firstRow.get("Name"));
        //System.out.println(firstRow.get("salary"));
        //System.out.println(firstRow);
        for(Map<String,String> row:excelData){
            for(Map.Entry<String,String> entry:row.entrySet()){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
            System.out.println("*****************");
        }


    }
}