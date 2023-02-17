package test.com.nhs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,10),this);
    }

    @FindBy(xpath = "//input[@id='inputEmail']")
    WebElement usernameField;

    @FindBy(xpath ="//input[@id='inputPassword']" )
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement signButton;

    public void signIn(String userName, String password) throws InterruptedException {
        Thread.sleep(500);
        usernameField.sendKeys(userName);
        Thread.sleep(500);
        passwordField.sendKeys(password);
        Thread.sleep(500);
        signButton.click();
    }
}
