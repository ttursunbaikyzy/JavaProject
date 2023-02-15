package classes.class25;

public class MovableTester {
    public static void main(String[] args) {
        Movable [] movables={new Car(), new Dog()};
        for(Movable m:movables){
            m.move();
        }
    }
}
