package com.sgic.automation.leaveSystem.pages;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class RecruitmentTypePage extends PageBase {
    public SoftAssert softAssert;

//    private static final Logger LOGGER = Logger.getLogger(RecruitmentType.class);

    private static By addrecruitmentbtn = By.xpath("//*[@title=\"addRecuitmentType\"]");
    private static By recruitmenttitle = By.xpath("//*[@class=\"h6 text-uppercase mb-0\"]");
    private static By addrecruitmentform = By.xpath("//*[text()='Add Recuitment Type']");
    private static By addrecruitmentformaddbtn = By.xpath("//*[@class=\"btn btn-info \"]");
    private static By addrecruitmentformnamefield = By.xpath("//*[@class=\"form-control\"]");
    private static By alreadyexistverificationmessage  = By.xpath("//*[text()='Recruitment type Already exist']");
    private static By addrecruitmentformclosebtn  = By.xpath("//*[@class=\"btn btn-danger \"]");
    private static By editrecruitmentbtn  = By.xpath("//*[@class=\"btn btn-danger \"]");
    private static By emptyverificationmessage  = By.xpath("//*[text()='Recruitment type cannot be Empty']");
    private static By alreadyexistverificationmessage  = By.xpath("//*[text()='Recruitment type Already exist']");


    public static boolean isRecruitmentPAgeDisplay(){
        return getDriver().findElement(recruitmenttitle).isDisplayed();
    }
    public static void clickAddRecruitmentBtn() {
        getDriver().findElement(addrecruitmentbtn).click();
    }
    public static boolean isAddRecuritmentPageDisplay(){
        return getDriver().findElement(addrecruitmentform).isDisplayed();
    }
    public static void setRecruitmentType(String recruitmentType) {
        getDriver().findElement(addrecruitmentformnamefield).sendKeys(recruitmentType);
    }
    public static void clickAddRecruitmentAddBtn() {
        getDriver().findElement(addrecruitmentformaddbtn).click();
    }
    public static boolean isEmptyVerificationMessageDisplay(){
        return getDriver().findElement(emptyverificationmessage).isDisplayed();
    }
    public static boolean isAlreadyExistVerificationMessageDisplay(){
        return getDriver().findElement(addrecruitmentform).isDisplayed();
    }
    public static void AddRecruitmentData(String recruitmentType){
        RecruitmentTypePage.isRecruitmentPAgeDisplay();
        RecruitmentTypePage.clickAddRecruitmentBtn();
        implicitWait(2);
        RecruitmentTypePage.isAddRecuritmentPageDisplay();
        RecruitmentTypePage.setRecruitmentType(recruitmentType);
        RecruitmentTypePage.clickAddRecruitmentAddBtn();
    }
    public static void AddEmptyRecruitmentData(){
        RecruitmentTypePage.isRecruitmentPAgeDisplay();
        RecruitmentTypePage.clickAddRecruitmentBtn();
        implicitWait(2);
        RecruitmentTypePage.isAddRecuritmentPageDisplay();
        RecruitmentTypePage.clickAddRecruitmentAddBtn();
        RecruitmentTypePage.isEmptyVerificationMessageDisplay();
    }
    public static void AddAlreadyExistRecruitmentData(){
        RecruitmentTypePage.isRecruitmentPAgeDisplay();
        RecruitmentTypePage.clickAddRecruitmentBtn();
        implicitWait(2);
        RecruitmentTypePage.isAddRecuritmentPageDisplay();
        RecruitmentTypePage.clickAddRecruitmentAddBtn();
        RecruitmentTypePage.isAlreadyExistVerificationMessageDisplay();
    }
}
