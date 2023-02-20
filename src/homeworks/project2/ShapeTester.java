package homeworks.project2;

public class ShapeTester {
    public static void main(String[] args) {
        Circle c=new Circle(5.5);
        c.calculateArea();
        c.calculatePerimeter();

        Square s=new Square(4);
        s.calculateArea();
        s.calculatePerimeter();
    }
}
