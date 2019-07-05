package com.sgic.automation.leaveSystem.pages;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class LeaveTypePage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(LeaveTypePage.class);
    private static By hdleaveDashboard = By.xpath("//h3");
    private static By AddButtonClick = By.xpath("//*[contains(@class,'btn btn-info btn-circle')]");
    private static By EnterLeaveType = By.id("exampleForm.ControlTextarea1");
    private static By SaveButton =By.xpath("//*[@class='modal-footer']//*[text()='Save']");
    private static By SuccessfullButton=By.xpath("//*[@class=\"swal-button swal-button--confirm\"]");

    public static boolean isDisplayhdleaveDashboard(){
        return getDriver().findElement(hdleaveDashboard).isDisplayed();

    }
    public static void clickAddButtonClick() {

        getDriver().findElement(AddButtonClick).click();
        LOGGER.info("****AddButtonClick***** ");
    }
    public static void click_ok_Button() {

        getDriver().findElement(SuccessfullButton).click();
        LOGGER.info("****ok Button***** ");
    }
    public static void clickSaveButtonClick() {

        getDriver().findElement(SaveButton).click();
        LOGGER.info("****SaveButtonClick***** ");
    }
    public static void setLeaveType(String txttype) {
        getDriver().findElement(EnterLeaveType).sendKeys(txttype);
        LOGGER.info("****Enter The Leave Type**** ");
    }

}
