package com.sgic.automation.leaveSystem.pages;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class RecruitmentTypePage extends PageBase {
    public SoftAssert softAssert;

//    private static final Logger LOGGER = Logger.getLogger(RecruitmentType.class);

    private static By addrecruitmentbtn = By.xpath("//*[@title=\"addRecuitmentType\"]");
    private static By recruitmenttitle = By.xpath("//*[@class=\"h6 text-uppercase mb-0\"]");
    private static By addrecruitmentform = By.xpath("//*[@class=\"modal-header\"]");
    private static By addrecruitmentformaddbtn = By.xpath("//*[@class=\"btn btn-info \"]");
    private static By addrecruitmentformnamefield = By.xpath("//*[@class=\"form-control\"]");
    private static By addrecruitmentformclosebtn  = By.xpath("//*[@class=\"btn btn-danger \"]");


    public static boolean isRecruitmentPAgeDisplay(){
        return getDriver().findElement(recruitmenttitle).isDisplayed();
    }
    public static void clickAddRecruitmentBtn() {
        getDriver().findElement(addrecruitmentbtn).click();
    }
    public static boolean isAddRecuritmentPageDisplay(){
        return getDriver().findElement(addrecruitmentform).isDisplayed();
    }
    public static void setRecruitmentType() {
        getDriver().findElement(addrecruitmentformnamefield).sendKeys("Permenant");
    }
    public static void clickAddRecruitmentAddBtn() {
        getDriver().findElement(addrecruitmentformaddbtn).click();
    }

    public static void AddRecruitmentData(){
        RecruitmentTypePage.isRecruitmentPAgeDisplay();
        RecruitmentTypePage.clickAddRecruitmentBtn();
        //RecruitmentTypePage.isAddRecuritmentPageDisplay();
        RecruitmentTypePage.setRecruitmentType();
        RecruitmentTypePage.clickAddRecruitmentAddBtn();
    }
}
