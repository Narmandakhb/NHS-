package test.com.nhs.stepDefinition;

import io.cucumber.java.en.*;
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
        public void user_successfully_logged_in_username_and_correct_password (String userName, String password) throws
        InterruptedException {
            loginPage.signIn(userName, password);
        }

        @Then("User should see {string}, {string}, {string} cards on the Dashboard")
        public void user_should_see_cards_on_the_dashboard (String patientWithRooms, String patientInWaitingRoom, String
        freeRoom){
            dashboardPage.validateText(patientWithRooms, patientInWaitingRoom, freeRoom);
        }

        @Then("User validates the numerical information about room {string}, {string}, {string}")
        public void user_validates_the_numerical_information_about_room (String numberOfPatientWithRoom, String
        numberOfPatientInWaitingRoom, String numberOfFreeRoom){
            dashboardPage.validateNumbersOfRooms(numberOfPatientWithRoom, numberOfPatientInWaitingRoom, numberOfFreeRoom);
        }
    }

