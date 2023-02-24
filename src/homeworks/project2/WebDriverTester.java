package homeworks.project2;

public class WebDriverTester {
    public static void main(String[] args) {
        ChromeDriver chrome=new ChromeDriver();
        System.out.println(chrome.getTitle());
        chrome.navigate();
        chrome.open();
        chrome.close();
        //chrome.getScreenshot();   not available
        System.out.println();

        FirefoxDriver firefox=new FirefoxDriver();
        System.out.println(firefox.getTitle());
        firefox.navigate();
        firefox.open();
        firefox.close();
        // firefox.getScreenshot();   not available
        System.out.println();

        SafariDriver safari=new SafariDriver();
        System.out.println(safari.getTitle());
        safari.navigate();
        safari.open();
        safari.close();
        // safari.getScreenshot();   not available

    }
}
