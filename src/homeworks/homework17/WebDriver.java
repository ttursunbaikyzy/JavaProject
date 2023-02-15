package homeworks.homework17;

public interface WebDriver {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}

class ChromeDriver implements WebDriver{
    public void openBrowser(){
        System.out.println("Opening Chrome browser");
    }
    public void closeBrowser(){
        System.out.println("Closing Chrome browser");
    }
    public void maximizeWindow(){
        System.out.println("Maximizing Chrome Window");
    }
    public void findElement(){
        System.out.println("Finding Chrome element");
    }
}
class FirefoxDriver implements WebDriver{
    public void openBrowser(){
        System.out.println("Opening Firefox browser");
    }
    public void closeBrowser(){
        System.out.println("Closing Firefox browser");
    }
    public void maximizeWindow(){
        System.out.println("Maximizing Firefox Window");
    }
    public void findElement(){
        System.out.println("Finding Firefox element");
    }
}