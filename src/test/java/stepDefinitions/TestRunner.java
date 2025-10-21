package stepDefinitions;

import appManager.applicationManager;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


@CucumberOptions(
            features = "src/test/resources/features",
            glue = {"stepDefinitions"},
            plugin = {
                    "pretty",
                    "html:target/cucumber-reports.html",
                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
            },

            monochrome = true,
            dryRun = true,
        tags = "@Smoke")


    public class TestRunner extends AbstractTestNGCucumberTests {

    applicationManager appManager = new applicationManager();

   /* @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();

    }
*/

 /*   @BeforeSuite
    public void setup(){
        appManager.getDriver();
        appManager.launchURL();
    }

    @AfterSuite
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) appManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed Scenario Screenshot");
        }
        appManager.closeBrowser(); // Close the browser
    }*/
}

