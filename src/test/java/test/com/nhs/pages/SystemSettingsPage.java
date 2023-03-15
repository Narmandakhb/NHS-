package test.com.nhs.pages;

import io.cucumber.java.zh_cn.假如;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;


public class SystemSettingsPage {

    public SystemSettingsPage(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//a[text()[contains(.,'    System settings')]]")
    WebElement systemSettingsBtn;

    @FindBy(xpath = "//input[@name='diseaseName']")
    WebElement diseaseNameField;

    @FindBy(xpath = "//input[@name='diseaseScore']")
    WebElement diseaseScoreField;

    @FindBy(xpath = "//input[@value='Add disease']")
    WebElement addDiseaseBtn;

    @FindBy(xpath = "//input[@placeholder='Search disease...']")
    WebElement diseaseSearchField;

    @FindBy(xpath = "//table[@id='diseases-table']//td[@class='sorting_1']")
    List<WebElement> existingAllDisease;

    @FindBy(xpath = "//input[@value='Psoriasis']")
    WebElement selectCheckBox;

    @FindBy(xpath = "//input[@value='Delete diseases']")
    WebElement deleteDiseaseBtn;


    public void clickingSystemSettings() {
        systemSettingsBtn.click();
    }

    public void addingDisease(String diseaseName, String diseaseScore) {
        diseaseNameField.sendKeys(diseaseName);
        diseaseScoreField.sendKeys(diseaseScore);
        addDiseaseBtn.click();
    }

//    public SystemSettingsPage verifyingNewAddedDiseaseInSystem(String diseaseName) {
//        diseaseNameField.sendKeys();
//        Assert.assertTrue(existingAllDisease.contains(diseaseName));
//        return this;
//    }

    public void deletingDisease(String diseaseName) {
        diseaseSearchField.clear();
        diseaseSearchField.sendKeys(diseaseName);
        selectCheckBox.click();
        deleteDiseaseBtn.click();

    }

}
