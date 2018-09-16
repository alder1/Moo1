package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class landingPage {
    WebDriver driver;

    public landingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

   // @FindBy (xpath = ".//*[@id='htmlBody']/section[8]/div[3]/button")
    //private WebElement closeButton;

    @FindBy(xpath = ".//*[@id='query']")
    private WebElement selectSearchField;

    @FindBy(xpath = ".//*[@id='search']/div/button")
    private WebElement clickButton;

     public void SearchField(String myItem) throws InterruptedException {
         //Thread.sleep(3000);
         //selectSearchField.click();
         //closeButton.click();
//         new WebDriverWait(driver, 120).until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='htmlBody']/section[8]/div[3]/button")));
    //     closeButton.click();
         selectSearchField.sendKeys(myItem);
     }
     public void SearchButton(){ clickButton.click();}
}


