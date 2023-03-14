package test.com.nhs.stepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import test.com.nhs.pages.DashboardPage;
import test.com.nhs.pages.LoginPage;
import test.utils.ConfigReader;
import test.utils.DriverHelper;

public class DashBoardStepDef {

    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    DashboardPage dashboardPage = new DashboardPage(driver);

    @When("User successfully logged in username {string} and correct password {string}")
    public void user_successfully_logged_in_username_and_correct_password(String username, String password) throws InterruptedException {
        loginPage.signIn(username, password);
    }

    @When("User can see the tabs displayed on the Dashboard")
    public void user_can_see_the_tabs_displayed_on_the_dashboard() {
        dashboardPage.verifyDashboardTabsTexts();
    }

    @Then("User can see hospital {string} {string} {string} rooms capacity numbers")
    public void user_can_see_hospital_rooms_capacity_numbers(String expectedNr1, String expectedNr2, String expectedNr3) {
        dashboardPage.validateNumbersOfRooms(expectedNr1, expectedNr2, expectedNr3);

    }

    @Then("User can see the Patients with rooms table displayed on the home page")
    public void user_can_see_the_patients_with_rooms_table_displayed_on_the_home_page() {
        dashboardPage.verifyPatientsWithRoomsTableHeaders();
    }


}

