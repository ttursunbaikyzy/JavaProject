package homeworks.homework14;

public class Shape {
    /*
    Task1:
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */

    double radius;
    Shape (double radius){
        this.radius=radius;
    }

    void printRadius() {
        System.out.println("radius is "+radius);
    }
}

class Circle extends Shape {

    Circle(double radius) {
        super(radius);
    }

    double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }


}
