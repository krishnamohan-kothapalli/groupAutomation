package appManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class applicationManager extends propertyFileReader {


    public static WebDriver driver;

    //To initiate web browser
    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
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
    }

}
