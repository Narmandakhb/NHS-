package test.com.nhs.stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import test.com.nhs.pages.SystemSettingsPage;
import test.utils.DriverHelper;



public class SystemSettingsStepDef {

    WebDriver driver= DriverHelper.getDriver();
SystemSettingsPage systemSettingsPage =new SystemSettingsPage(driver);
    @When("User clicks on the 'System settings' side bar")
    public void user_clicks_on_the_side_bar() {
        systemSettingsPage.clickingSystemSettings();

   }
@When("User adds new disease name {string} score {string} to system and clicks add button")
public void user_adds_new_disease_name_score_to_system_and_clicks_add_button(String diseaseName, String diseaseScore) {
        systemSettingsPage.addingDisease(diseaseName, diseaseScore);


}
    @Then("User can see the disease in and Delete diseases {string} from the system table")
    public void user_can_see_the_disease_in_and_delete_diseases_from_the_system_table(String diseaseName) {
        systemSettingsPage.deletingDisease(diseaseName);

    }


}
