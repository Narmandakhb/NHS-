package test.com.nhs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import test.utils.BrowserUtils;
import test.utils.DriverHelper;

import java.util.*;

public class AddPatientPage extends BrowserUtils {

    public AddPatientPage(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//a[contains(text(),'  Add patient')]")
    WebElement addPatientButton;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@name='hospitalNumber']")
    WebElement hospitalNoField;

    @FindBy(xpath = "//input[@name='dateOfBirth']")
    WebElement DOBField;

    @FindBy(xpath = "//label[text()[contains(.,' Female')]]")
    WebElement genderButton;

    @FindBy(xpath = "//input[@value='Add patient']")
    WebElement addPatientSubmit;

    @FindBy(xpath = "//input[@type='checkbox']")
    List<WebElement> existingAllDiseases;


    //===========================Methods===================
    public void addPatientSideBarBtn() {
        addPatientButton.click();
    }
    public void addingNewPatient(String firstName, String lastName, String hospitalNo, String DOB) throws InterruptedException {
        Thread.sleep(500);
        firstNameField.sendKeys(firstName);
        Thread.sleep(500);
        lastNameField.sendKeys(lastName);
        Thread.sleep(500);
        hospitalNoField.sendKeys(hospitalNo);
        Thread.sleep(500);
        DOBField.sendKeys(DOB);
        Thread.sleep(500);
        genderButton.click();
        Thread.sleep(500);

    }
    public void addingPatientDiagnosis(WebDriver driver)  {
        ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
        for (int i = 0; i < existingAllDiseases.size(); i++) {
            List<String> diseases = new ArrayList<>();
            diseases.add(existingAllDiseases.get(i).getText());
            Random random = new Random();
            int randomD = random.nextInt(diseases.size());
            diseases.get(randomD);
            WebElement diseaseCheckBox = DriverHelper.getDriver().findElement(By.xpath("//input[@name='PD[]" + diseases.get(randomD) + "']"));
            diseaseCheckBox.click();
        }
    }
    public void clickAddPatientButton() {
        addPatientSubmit.click();
    }
}








