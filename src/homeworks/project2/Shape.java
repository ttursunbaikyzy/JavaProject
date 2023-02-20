package homeworks.project2;

public interface Shape {
    void calculateArea();
    void calculatePerimeter();

}

class Circle implements Shape {

    double radius;
    Circle (double radius){
        this.radius=radius;
    }
    public void calculateArea(){
        double area = Math.PI * this.radius * this.radius;
        System.out.println("The area of the circle is "+area);
    }
    public void calculatePerimeter(){
        double perimeter = 2 * Math.PI * this.radius;
        System.out.println("The perimeter of the circle is "+perimeter);
    }

}
class Square implements Shape {
    double side;
    Square (double side){
        this.side =side;
    }
    public void calculateArea(){
        double area = side*side;
        System.out.println("The area of the square is "+area);
    }
    public void calculatePerimeter(){
        double perimeter = 4*side;
        System.out.println("The perimeter of the square is "+perimeter);
    }
}
