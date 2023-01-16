package classes.class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Below line is reserving a box in the computer's memory
        We are calling it box1, if we need the information that we are storing inside this box
        we can simply say to the computer give us the contents of box1.
        int=> what type of date we want to store
        box1=> is the name of the box
        = sign will take whatever we write after it and will store inside the box1
        10=> is what we are storing inside the box
         */
        int box1=10;
        // if we are printing something from a box we don't need ""
        System.out.println(box1); //bring the contents of box1 and print them on the console
        /*To store whole numbers (Numbers without decimals points) we have 4 different types of boxes.
        1) byte 2) short 3) int 4) long
         */
        byte box2=12; // byte cannot be 128 (large number, only for small numbers: max 127)
        byte box3=-128; // maximum for negative is -129, so range is -128 to 127
        short box4=32767; /* if we need to store larger numbers we should try short
        short: The short data type is a 16-bit signed two's complement integer.
        It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).*/
        int biggerbox=123456484; // most common type of box
        long maxBox=1513135153345156l; // assignment: why do we need l at the end for the longs

        /*
        Reserve a box which can hold the number 10000 call it myBox and print its values on the console
         */
        short myBox=10000;
        System.out.println(myBox);

    }
}
