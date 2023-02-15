package test.com.nhs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import test.utils.BrowserUtils;
import test.utils.ConfigReader;
import test.utils.DriverHelper;

import java.time.Duration;

public class Hook {

    public WebDriver driver;

    @Before
    public void setup(){
        driver= DriverHelper.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @After
    public void tearDown(){
        BrowserUtils.getScreenShot(driver,"nhs");
    }




}
