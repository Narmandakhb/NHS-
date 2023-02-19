package test.com.nhs.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class DashboardPage {

    public DashboardPage(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10),this);
    }

@FindBy(xpath = "//div[.='Patients with rooms']//preceding-sibling::div")
    WebElement patientsWithRooms;

 @FindBy(xpath = "//div[.='Patients waiting']//preceding-sibling::div")
    WebElement patientInWaitingRoom;

 @FindBy(xpath = "//div[.='Free rooms']//preceding-sibling::div")
    WebElement freeRooms;

 @FindBy(xpath = "//div[@id='patients-with-rooms-live']")
    WebElement numberOfRoomWithPatient;
 @FindBy(xpath = "//div[@id='patients-waiting-live']")
         WebElement numberOfWaitingPatient;

 @FindBy(xpath = "//div[@id='free-rooms-live']")
    WebElement numberOfFreeRooms;


public void validateText(String expectedPatientWithRooms, String expectedPatientInWaitingRoom,
                         String expectedFreeRooms){
    Assert.assertEquals(expectedPatientWithRooms, patientsWithRooms.getText());
    Assert.assertEquals(expectedPatientInWaitingRoom, patientInWaitingRoom.getText());
    Assert.assertEquals(expectedFreeRooms, freeRooms.getText());
 }
 public void validateNumbersOfRooms(String expectedNumberOfPatientWith,String expectedNumberOfPatientsInWaiting,
                                    String expectedNumberOfFree){
    Assert.assertEquals(expectedNumberOfPatientWith, numberOfRoomWithPatient.getText());
    Assert.assertEquals(expectedNumberOfPatientsInWaiting, numberOfWaitingPatient.getText());
    Assert.assertEquals(expectedNumberOfFree, numberOfFreeRooms.getText());
 }
}
