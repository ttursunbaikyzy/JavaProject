package homeworks.homework12;

public class Food {
    /* Task 4:
    Write program that have static constructor and observe result.
     */

    String name;
    String taste;

    /* error => static keyword is not allowed with constructor:
    static Food (String foodName, String foodTaste){
        name=foodName;
        taste=foodTaste;
    }

    */

    void printFood () {
        System.out.println(name+" is "+taste);
    }

}
