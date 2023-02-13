package classes.class24;

public abstract class Phone {
    /*
    create a phone class lets create abstract methods like displayPictures
    unlockPhone
    SendText
    2 child classes Iphone Samsung Google and provide specific implementation
    lets write code to achieve runtime polymorphism
     */

    abstract void displayPictures();
    abstract void unlockPhone();
    abstract void sendText();

}

class IPhone extends Phone{
    void displayPictures(){
        System.out.println("Browse pictures in photos");
    }
    void unlockPhone(){
        System.out.println("Unlocking the IPhone with Face ID");
    }
    void sendText(){
        System.out.println("Sending a text via iMessages");
    }
}
class Samsung extends Phone{
    void displayPictures(){
        System.out.println("Browsing pictures in the gallery");
    }
    void unlockPhone(){
        System.out.println("Unlocking the Samsung with finger print sensor or camera");
    }
    void sendText(){
        System.out.println("Sending a text via messages app");
    }
}
