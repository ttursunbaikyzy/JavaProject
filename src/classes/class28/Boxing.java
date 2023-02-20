package classes.class28;

import java.util.ArrayList;

public class Boxing {
    public static void main(String[] args) {
        Integer integer=new Integer(10);
        int number=integer; // it's unboxing
        int number2=integer.intValue(); // unboxing

        double d=12.3;
        Double wrapperD=new Double(d); // boxing
        Double wrapperB=d; // autoboxing
        Double wrapperC=12.5;

        Float f=12f;
        ArrayList<Float> arrayList=new ArrayList<>();
        arrayList.add(12.1f);

        double fg=12f;


    }
}
