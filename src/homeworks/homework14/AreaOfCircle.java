package homeworks.homework14;

public class AreaOfCircle {
    public static void main(String[] args) {

        Shape shape = new Shape(7.5);
        shape.printRadius();

        Circle circle=new Circle(7.5);
        circle.printRadius();
        System.out.println("The area of the circle is "+circle.getArea());

    }
}
