package classes.class12;

public class FoodTester {
    public static void main(String[] args) {

        Food food1 = new Food();

        food1.name="Pizza";
        food1.type="Pepperoni";
        food1.taste="delicious";

        food1.eat();
        food1.satisfied();

    }
}
