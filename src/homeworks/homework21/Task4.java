package homeworks.homework21;

public class Task4 {
    public static void checkUserName(String un){
        if(un.length()<5){
            throw new RuntimeException("Username cannot be less than 5 characters");
        } else {
            System.out.println("Username input passed");
        }
    }

    public static void main(String[] args) {
        /*
        4) Create a method checkUserName that will throw a runtime exception.
        Method should throw an exception when entered username is less than 5 characters.
         */
        checkUserName("java");
    }
}
