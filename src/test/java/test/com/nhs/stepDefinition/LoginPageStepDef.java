package test.com.nhs.stepDefinition;

import io.cucumber.java.en.*;
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
    public void user_provides_correct_username_and_correct_password(String userName, String password) {
loginPage.signIn(userName, password);

    }
    @Then("User validates {string}")
    public void user_validates(String string) {
    
    }

}
