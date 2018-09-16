package  step_definition;

import DriverInstance.driverInstance;
import Pages.landingPage;
import Pages.validSearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class validSearchTest extends driverInstance {
    landingPage lp = new landingPage(driver);
    validSearchPage vsp = new validSearchPage(driver);


    @Given("^I launch the moo website$")
    public void i_launch_the_moo_website() throws Throwable {
        System.out.println("The moo website is launched");
    }

    @When("^I enter a valid item into the search field and click enter$")
    public void i_enter_a_valid_item_into_the_search_field_and_click_enter() throws Throwable {
       lp.SearchField("postcards");
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("src/main/java/ScreenShots/valid_search1.png"));
       lp.SearchButton();
        File srcFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile1, new File("src/main/java/ScreenShots/valid_search2.png"));
    }

    @Then("^I should be able to view all products matching my search item$")
    public void i_should_be_able_to_view_all_products_matching_my_search_item() throws Throwable {
        vsp.AssertValidPostcards();
    }

    @Then("^I should be able to confirm the total results returned for my search item$")
    public void i_should_be_able_to_confirm_the_total_results_returned_for_my_search_item() throws Throwable {
        vsp.CountResult();
    }
}