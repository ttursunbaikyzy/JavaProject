package homeworks.homework16;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and
    override some of the methods in child classes.
    Define some methods specific to child classes
    Create objects of child classes and store them into array.
    Loop through each object and execute available methods.
     */
    int RAM;
    int storage;
    String OS;
    void browseInternet(){
        System.out.println("Browse the internet");
    }
    void playVideo(){
        System.out.println("Video is playing");
    }
    void playMusic(){
        System.out.println("Music is playing");
    }
}

class Apple extends Computer {
    void playVideo(){
        System.out.println("Playing the video on QuickTimePlayer");
    }
    void browseInternet(){
        System.out.println("Browsing the internet using Safari");
    }
    void editVideos(){
        System.out.println("Editing on iMovies");
    }
    void installApp(){
        System.out.println("installing the apps from App Store");
    }
}

class HP extends Computer {
    void browseInternet(){
        System.out.println("Browsing the internet using chrome");
    }
    void playVideo(){
        System.out.println("playing the video using VLC player");
    }
    void installApp(){
        System.out.println("installing the apps from Microsoft Store");
    }
}

class Dell extends Computer {
    void browseInternet(){
        System.out.println("Browsing the internet using Google Chrome");
    }
    void playVideo(){
        System.out.println("playing the video using Video player");
    }
    void playMusic(){
        System.out.println("playing the music using Music player");
    }
    void installApp(){
        System.out.println("installing the apps from Microsoft Store");
    }
}

class Lenovo extends Computer {
    void browseInternet(){
        System.out.println("Browsing the internet using Microsoft Edge");
    }
    void playVideo(){
        System.out.println("playing the video using Video player");
    }
    void playMusic(){
        System.out.println("playing the music using Music player");
    }
    void installApp(){
        System.out.println("installing the apps from Microsoft Store");
    }

}

class ComputerTest {
    public static void main(String[] args) {
    Computer[] computers={new Apple(),new HP(),new Dell(), new Lenovo()};

    // int a =(int)12.5;

    for (Computer c:computers){
        c.playMusic();
        c.playVideo();
        c.browseInternet();

        if (c instanceof Apple) { // we are checking if the variable c contains the object of an Apple class
            Apple apple = (Apple)c; // converting the variable c back to an apple object
            apple.editVideos();
            apple.installApp();
        }
    }
}
}