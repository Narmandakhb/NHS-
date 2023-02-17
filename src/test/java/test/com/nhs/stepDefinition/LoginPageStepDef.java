package test.com.nhs.stepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import test.com.nhs.pages.LoginPage;
import test.utils.ConfigReader;
import test.utils.DriverHelper;

public class LoginPageStepDef {

     WebDriver driver = DriverHelper.getDriver();

     LoginPage loginPage = new LoginPage(driver);

    @Given("User navigates to the NHS website")
    public void user_navigates_to_the_nhs_website() {
        driver.get(ConfigReader.readProperty("QA_NHS_url"));

    }
    @When("User provides correct username {string} and correct password {string}")
    public void user_provides_correct_username_and_correct_password(String userName, String password) throws InterruptedException {
loginPage.signIn(userName, password);

    }
    @Then("User validates the page title is {string}")
    public void user_validates_the_page_title_is(String expectedTitle) {
        Assert.assertEquals(expectedTitle,driver.getTitle().trim());
    }
    @When("User enters  {string} and  {string}")
    public void user_enters_and(String username, String password) throws InterruptedException {
        loginPage.signIn(username,password);

    }


}
