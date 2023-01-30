package homeworks.homework10;

public class Task4 {
    // Create a method that will say Hello in different language based on the country that will passed when method is executed

    String sayHello (String country){
        switch (country){
            case "USA":
                return "Hello";
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
        Task4 greetings = new Task4();
        System.out.println(greetings.sayHello("Italy"));

    }



}
