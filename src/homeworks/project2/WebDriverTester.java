package homeworks.project2;

public class WebDriverTester {
    public static void main(String[] args) {
        ChromeDriver chrome=new ChromeDriver();
        System.out.println(chrome.getTitle());
        chrome.navigate();
        chrome.open();
        chrome.getScreenshot();
        chrome.getTitle();
        chrome.close();
        System.out.println();

        FirefoxDriver firefox=new FirefoxDriver();
        System.out.println(firefox.getTitle());
        firefox.navigate();
        firefox.open();
        firefox.getScreenshot();
        firefox.getTitle();
        firefox.close();
        System.out.println();

        SafariDriver safari=new SafariDriver();
        System.out.println(safari.getTitle());
        safari.navigate();
        safari.open();
        safari.getScreenshot();
        safari.getTitle();
        safari.close();

    }
}
