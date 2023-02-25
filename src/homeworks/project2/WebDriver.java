package homeworks.project2;

public interface WebDriver {
    void open();

    void close();

    String getTitle();
}

interface TakeScreenshot {
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakeScreenshot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver {
    @Override
    public void navigate(){
        System.out.println("Download Chrome Driver");
    }
    @Override
    public void open(){
        System.out.println("Opening Chrome Driver");
    }
    @Override
    public void close(){
        System.out.println("Closing Chrome Driver");
    }
    @Override
    public String getTitle(){
        return "Chrome Driver";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking a screenshot on Chrome Driver");
    }
}

class FirefoxDriver implements RemoteWebDriver {
    @Override
    public void navigate(){
        System.out.println("Download Firefox Driver");
    }
    @Override
    public void open(){
        System.out.println("Opening Firefox Driver");
    }
    @Override
    public void close(){
        System.out.println("Closing Firefox Driver");
    }
    @Override
    public String getTitle(){
        return "Firefox Driver";
    }
    @Override
    public void getScreenshot() {
        System.out.println("Taking a screenshot on Firefox Driver");
    }
}

class SafariDriver implements RemoteWebDriver {
    @Override
    public void navigate(){
        System.out.println("Download Safari Driver");
    }
    @Override
    public void open(){
        System.out.println("Opening Safari Driver");
    }
    @Override
    public void close(){
        System.out.println("Closing Safari Driver");
    }
    @Override
    public String getTitle(){
        return "Safari Driver";
    }
    @Override
    public void getScreenshot() {
        System.out.println("Taking a screenshot on Safari Driver");
    }
}

