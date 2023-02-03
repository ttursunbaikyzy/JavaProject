package videos.videos8;

public class Shirt {
    public static String color;
    public static char size;

    Shirt(){

    }
    Shirt (String newColor, char newSize) {
        color=newColor;
        size=newSize;
    }

    public static void putOn() {
        System.out.println("Shirt is on");
    }
    public static void takeOff() {
        System.out.println("Shirt is off");
    }

    public static void setColor(String newColor) {
        color = newColor;
    }

    public static void setSize(char newSize) {
        size = newSize;
    }


    public static void main(String[] args) {
        Shirt s = new Shirt("White", 'M');

        System.out.println(s.color);
        System.out.println(s.size);
    }

}