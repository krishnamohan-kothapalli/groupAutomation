package appManager;

import helperBase.helperBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class applicationManager extends propertyFileReader {


    public static WebDriver driver;
    helperBase helperbase = new helperBase();

    //To initiate web browser
    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            helperBase.log.info("Browser opened");
        }
        return driver;
    }

    // To launch the url
    public void launchURL(){
        driver.get(propertyFileReader.get("URL"));
    }

    // To close the browser
    public void closeBrowser(){
        driver.quit();
        helperBase.log.info("Browser closed");
    }

}
