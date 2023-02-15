package homeworks.homework17;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver [] webDrivers = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver wd: webDrivers){
            wd.openBrowser();
            wd.maximizeWindow();
            wd.findElement();
            wd.closeBrowser();
        }
    }
}
