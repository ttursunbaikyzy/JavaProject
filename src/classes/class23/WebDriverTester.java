package classes.class23;

public class WebDriverTester {
    public static void main(String[] args) {

        /*WebDriver webDriver=new Firefox(); // up casting
        // Firefox firefox=new WebDriver(); // down casting >> cannot be executed this way, need to explicitly done
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLogin();

        webDriver.closeBrowser();*/
        // an Array of type parent class can hold the objects of all the child classes

        /* Chrome chrome=new Chrome();
        Safari safari=new Safari();
        Firefox firefox=new Firefox();

        WebDriver [] browsers = {chrome, safari, firefox};*/

        WebDriver [] browsers = {new Chrome(),new Safari(), new Firefox()};

        for (WebDriver browser:browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLogin();
            browser.closeBrowser();
            System.out.println();
        }



        /*Chrome googleChrome=new Chrome();
        googleChrome.startBrowser();
        googleChrome.openURL();
        googleChrome.testLogin();
        googleChrome.closeBrowser();

        Safari safari=new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLogin();
        safari.closeBrowser();

        Firefox firefox=new Firefox();
        firefox.startBrowser();
        firefox.openURL();
        firefox.testLogin();
        firefox.closeBrowser();*/

    }
}
