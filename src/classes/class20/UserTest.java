package classes.class20;

public class UserTest {
    UserTest(){
        super();
    }

    public static void main(String[] args) {

        UserInfo user = new UserInfo("Sam","123-456-7890","123 Street");
        user.userDetails();

        // methods in parent class? 0
        // methods in chalid class? 1

        // ALL CLASSES IN JAVA HAVE A PARENT CLASS
        // WHO IS THE PARENT? - PARENT OF ALL CLASSES - IS OBJECT CLASS

    }
}
