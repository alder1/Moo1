package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class invalidSearchPage {
    WebDriver driver;

    public invalidSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = ".//*[@id='hits']/div/div/div")
    private WebElement verifyError;

    public boolean AssertErrorMessage(){
        return verifyError.isDisplayed();
    }
}
