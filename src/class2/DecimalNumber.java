package class2;

public class DecimalNumber {
    public static void main(String[] args) {
        /*
        if we want to store decimal numbers in computer's memory using Java,
        we can use following types of boxes
        float
        decimal
         */
        float myNumberBox=10.5f;
        float mySecondBox=5.5f;
        double largeDecimalBox=134545455.12121;
        System.out.println(myNumberBox);
        System.out.println(mySecondBox);
        System.out.println(largeDecimalBox);

        /*
        If we want to store characters (#,$,o,s,4) we wan use char datatype
         */
        char letter='K'; // can hold only 1 letter or symbol at a time
        char gender='M';
        char symbol='#';
        char numberChar='1';

        /*
        String data type belongs to a different category called non-primitives
        that's why for String rules are a little different
        for example S of String is uppercase, it's color is also not blue
        we will discuss later on.
         */
        String name="Sam";

        // boolean can hold only 2 values = true/false
        boolean hungry=true; // true means yes
        boolean sleepy=false; // false means no

        // we can't name two variables with the same name, it's not allowed



    }
}
