package features;

import DriverInstance.driverInstance;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class hooks {
    driverInstance di=new driverInstance();
    @Before
    public void setUpTest(){
        di.openBrowser();
    }

    @After
    public void tearDown(){
        //di.closeBrowser();
    }
}

w