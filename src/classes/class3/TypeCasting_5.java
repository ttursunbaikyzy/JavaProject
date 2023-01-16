package classes.class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        byte shorterNumber=(byte) number;

        float f=10.5f;
        int num=(int) f;

        System.out.println(shorterNumber);
        System.out.println(num);

        /* in ascending order:
        byte
        short
        int
        long
        float
        double
        if we try to store the contents from a smaller box to a larger box java doesn't complain
        because the content can easily fit inside a larger box
        but if we try other way around we get an error and we need to type cast it to store the contents
         */

        byte b=10;
        int number2=b;
        // short c=number2;   error due to size
        short c= (short) number2;
        System.out.println(b);

        float eggs=12.5f;
        int wholePart=(int)eggs; // type casting we are converting from float to an int
        System.out.println(wholePart);

        System.out.println((char)128516);
        System.out.println((char)65);
        System.out.println((char)71);
        System.out.println((char)99);
        System.out.println((char)98);

    }
}
