package homeworks.homework12;

public class TShirt {
    /* Task1:
    Write a java class that will have a constructor:
    one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */

    String color;
    String size;

    TShirt(){

    }
    TShirt (String newColor, String newSize) {
        color=newColor;
        size=newSize;
    }

    void printInfo () {
        System.out.println("The T-Shirt is "+color+" and the size is "+size);
    }




}
