package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class validSearchPage {
    WebDriver driver;

    public validSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = ".//*[@id='stats-container']/div/div/div/div/div")
    private WebElement verifyPostcards;

    @FindBy(xpath = ".//*[@id='stats-container']/div/div/div/div/p")
    private WebElement TotalResultCount;

     public boolean AssertValidPostcards(){
    return verifyPostcards.isDisplayed();
     }
     public void CountResult(){
         System.out.println(TotalResultCount.getText());
         String expectedResult= "165 pages found in 7ms";
         String actualResult = TotalResultCount.getText();
         Assert.assertEquals(expectedResult,actualResult);
     }
}