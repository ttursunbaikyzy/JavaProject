package homeworks.homework10;

public class Task4InClass {
    /* Create a method that will say Hello
    in different language based on the country
    that will passed when method is executed

    return type => String void
    name =sayHello
    parameter => String country
     */

    String sayHello (String country){
        switch (country){
            case "USA":
                return "Hello"; // break is not needed when we use the return keyword
            case "Mexico":
                return "Hola";
            case "Russia":
                return "Privet";
            case "Italy":
                return "Ciao";
            case "Egypt":
                return "Ahlan";
            default:
                return "Invalid";
        }
    }

    public static void main(String[] args) {
        Task4InClass greetings = new Task4InClass();
        System.out.println(greetings.sayHello("Italy"));

    }



}
