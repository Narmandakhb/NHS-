package test.com.nhs.stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import test.com.nhs.pages.AddPatientPage;
import test.com.nhs.pages.DashboardPage;
import test.com.nhs.pages.LoginPage;
import test.utils.DriverHelper;

public class AddPatientStepDef {

    WebDriver driver = DriverHelper.getDriver();


LoginPage loginPage= new LoginPage(driver);

        AddPatientPage addPatientPage = new AddPatientPage(driver);




        @When("User click clicks on the Add patient side bar button")
        public void user_click_clicks_on_the_add_patient_side_bar_button () throws InterruptedException {

           addPatientPage.addPatientSideBarBtn();
        }
        @When("User able to add new patient details and clicks Add patient button on the add patient page")
        public void user_able_to_add_new_patient_details_and_clicks_add_patient_button_on_the_add_patient_page () throws InterruptedException {
            addPatientPage.addingNewPatient("Park", "Yong", "10", "09/6/2000");
        }
        @Then("User can see the patient in Patients waiting table")
        public void user_can_see_the_patient_in_patients_waiting_table () {
            addPatientPage.addingPatientDiagnosis(driver);
            addPatientPage.clickAddPatientButton();
        }

    }
