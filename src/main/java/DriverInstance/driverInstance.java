package DriverInstance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class driverInstance {
    public  static WebDriver driver;

    //This will open the browser
    public void openBrowser() {
        ResourceBundle config = ResourceBundle.getBundle("config");
        if (config.getString("browser").equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "src\\main\\java\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (config.getString("browser").equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\main\\java\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        //} else {
          //  System.setProperty("webdriver.ie.driver", "src\\main\\java\\drivers\\IEDriverServer.exe");
           // driver = new InternetExplorerDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(config.getString("URL"));
        driver.manage().window().maximize();
    }
    //This will close browser
    public void closeBrowser(){
        driver.quit();
    }
}
