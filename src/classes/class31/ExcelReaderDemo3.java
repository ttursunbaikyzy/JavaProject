package classes.class31;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo3 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> row1=new LinkedHashMap<>();
        row1.put("Name","Tami");
        row1.put("age","22");
        row1.put("City","Houston");
        row1.put("salary","250000");

        LinkedHashMap<String,String> row2=new LinkedHashMap<>();
        row2.put("Name","Sam");
        row2.put("age","33");
        row2.put("City","Houston");
        row2.put("salary","200000");

        LinkedHashMap<String,String> row3=new LinkedHashMap<>();
        row3.put("Name","Abeera");
        row3.put("age","18");
        row3.put("City","Fairfax");
        row3.put("salary","150000");

        List<Map<String,String>> allRows=new ArrayList<>();
        allRows.add(row1);
        allRows.add(row2);
        allRows.add(row3);

        System.out.println(allRows);

    }
}
