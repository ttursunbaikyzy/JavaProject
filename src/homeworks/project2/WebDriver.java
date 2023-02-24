package homeworks.project2;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver {
    void navigate();
}

interface TakeScreenshot extends RemoteWebDriver{
    void getScreenshot();
}

class ChromeDriver implements RemoteWebDriver, WebDriver, TakeScreenshot {
    public void navigate(){
        System.out.println("Download Chrome Driver");
    }
    public void open(){
        System.out.println("Opening Chrome Driver");
    }
    public void close(){
        System.out.println("Closing Chrome Driver");
    }
    public String getTitle(){
        return "Chrome Driver";
    }
    public void getScreenshot(){
        System.out.println("Taking screenshot of Chrome Driver");
    }

}

class FirefoxDriver implements RemoteWebDriver, WebDriver, TakeScreenshot {
    public void navigate(){
        System.out.println("Download Firefox Driver");
    }
    public void open(){
        System.out.println("Opening Firefox Driver");
    }
    public void close(){
        System.out.println("Closing Firefox Driver");
    }
    public String getTitle(){
        return "Firefox Driver";
    }
    public void getScreenshot(){
        System.out.println("Taking screenshot of Firefox Driver");
    }
}

class SafariDriver implements RemoteWebDriver, WebDriver, TakeScreenshot {
    public void navigate(){
        System.out.println("Download Safari Driver");
    }
    public void open(){
        System.out.println("Opening Safari Driver");
    }
    public void close(){
        System.out.println("Closing Safari Driver");
    }
    public String getTitle(){
        return "Safari Driver";
    }
    public void getScreenshot(){
        System.out.println("Taking screenshot of Safari Driver");
    }
}

