package test.com.nhs.pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.ArrayList;
import java.util.List;

import static test.utils.BrowserUtils.getTextMethod;

public class DashboardPage {

    public DashboardPage(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//div[@id='patients-with-rooms-live']/..//div[contains(text(),'Patients with rooms')]")
    WebElement titlePatientsWithRoom;
////div[@id='patients-with-rooms-live']//following-sibling::div[.='Patients with rooms']]
    @FindBy(xpath = "//div[@id='patients-waiting-live']//following-sibling::div[.='Patients waiting']")
    WebElement titlePatientsWaiting;
    @FindBy(xpath = "//div[@id='free-rooms-live']//following-sibling::div[contains(text(),'Free rooms')]")
    WebElement titleFreeRooms;

    @FindBy(xpath = "//div[@id='patients-with-rooms-live']")
    WebElement numberPatientWithRooms;

    @FindBy(xpath = "//div[@id='patients-waiting-live']")
    WebElement numberPatientWaiting;

    @FindBy(xpath = "//div[@id='free-rooms-live']")
    WebElement numberFreeRooms;


    @FindBy(xpath = "//div[@id='patients-in-hospital_wrapper']//th[text()[contains(.,'no.')]]")
    WebElement inHospitalNoColumn;

    @FindBy(xpath = "//div[@id='patients-in-hospital_wrapper']//th[contains(text(),'Patients with rooms')]")
    WebElement inHospitalPatientsWithRoomColumn;

    @FindBy(xpath = "//div[@id='patients-in-hospital_wrapper']//th[contains(text(),'Room')]")
    WebElement inHospitalRoomColumn;
    @FindBy(xpath = "//div[@id='patients-in-hospital_wrapper']//th[contains(text(),'Score')]")
    WebElement inHospitalScoreColumn;

    @FindBy(xpath = "//a[text()[contains(.,'  Add patient')]]")
    WebElement addPatientBtn;

    @FindBy(xpath = "//a[text()[contains(.,'    System settings')]]")
    WebElement SystemSettingsBtn;


//=================Methods============================

    public void verifyDashboardTabsTexts() {
        Assert.assertEquals("Patients with rooms", getTextMethod(titlePatientsWithRoom));
        Assert.assertEquals("Patients waiting",getTextMethod( titlePatientsWaiting));
        Assert.assertEquals("Free rooms", getTextMethod(titleFreeRooms));
    }

    public void validateNumbersOfRooms(String expectedNumberOfPatientWith,String expectedNumberOfPatientsInWaiting,
                                       String expectedNumberOfFree){
        Assert.assertEquals(expectedNumberOfPatientWith, numberPatientWithRooms.getText());
        Assert.assertEquals(expectedNumberOfPatientsInWaiting, numberPatientWaiting.getText());
        Assert.assertEquals(expectedNumberOfFree, numberFreeRooms.getText());

    }

    public void verifyPatientsWithRoomsTableHeaders() {
        Assert.assertEquals("no.",getTextMethod(inHospitalNoColumn));
        Assert.assertEquals("Patients with rooms",getTextMethod(inHospitalPatientsWithRoomColumn));
        Assert.assertEquals("Room", getTextMethod(inHospitalRoomColumn));
        Assert.assertEquals("Score", getTextMethod(inHospitalScoreColumn));
    }


}
