package step_definition;

import DriverInstance.driverInstance;
import Pages.invalidSearchPage;
import Pages.landingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class invalidSearchTest extends driverInstance {

    landingPage lp = new landingPage(driver);
    invalidSearchPage isp = new invalidSearchPage(driver);

    @Given("^I am on the Moo website$")
    public void i_am_on_the_Moo_website() throws Throwable {
        System.out.print("This is to test user is on mMoo landing Page");
    }
    @When("^I enter seasoning into the search field$")
    public void i_enter_seasoning_into_the_search_field() throws Throwable {
        lp.SearchField("seasoning");
    }
    @When("^I click on the search icon$")
    public void i_click_on_the_search_icon() throws Throwable {
        lp.SearchButton();

    }
    @Then("^an error message should be displayed$")
    public void an_error_message_should_be_displayed() throws Throwable {
       isp.AssertErrorMessage();
    }
}
