package stepDefinitions;

import appManager.applicationManager;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs extends applicationManager {

    @Given("user opens the application")
    public void userOpensTheApplication() {
        getDriver();
        throw new PendingException();
    }

    @Then("user validates the page title")
    public void userValidatesThePageTitle() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("user closes the application")
    public void userClosesTheApplication() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
