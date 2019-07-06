package com.sgic.automation.leaveSystem.tests.LeaveTypeTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.leaveSystem.pages.DashboardPage;
import com.sgic.automation.leaveSystem.pages.LeaveTypePage;
import com.sgic.automation.leaveSystem.testData.LeaveTestDatas;
import com.sgic.automation.leaveSystem.utils.Constants;
import com.sgic.automation.leaveSystem.utils.TestBase;;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class LeaveTypeTest extends TestBase {
    private static final org.apache.log4j.Logger LOGGER = Logger.getLogger(LeaveTypeTest.class);
    @Test(priority = 1)
    public void SaveUserTest(){
        softAssert = new SoftAssert();
        DashboardPage.clickManageLeaveMenu();
        extentTest=extentReport.startTest("LeaveType");
        LOGGER.info("DashBoardPage is menu CLick");
        DashboardPage.clickManageLeaveTypeSubMenu();
        LOGGER.info("DashBoardPage is Submenu Leave type CLick");
        LeaveTypePage.clickAddButtonClick();
        LeaveTypePage.setLeaveType(Constants.OrgUserName);
        LeaveTypePage.clickSaveButtonClick();
        LeaveTypePage.implicitWait(3);
//        LeaveTypePage.click_ok_Button();
        LeaveTypePage.clickCancelButtonClick();
        extentTest.log(LogStatus.PASS, " library management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test(priority = 2)
    public void EmptyLeaveTypeTest(){
        softAssert = new SoftAssert();
        extentTest=extentReport.startTest("EmptyLeaveType");
        DashboardPage.clickManageLeaveMenu();
        LOGGER.info("DashBoardPage is menu CLick");
        DashboardPage.clickManageLeaveTypeSubMenu();
        LOGGER.info("DashBoardPage is Submenu Leave type CLick");
        LeaveTypePage.clickAddButtonClick();
        LeaveTypePage.setLeaveType(Constants.EmptyLeaveType);
        LOGGER.info("Enter The Empty Value");
        LeaveTypePage.clickSaveButtonClick();
        LeaveTypePage.implicitWait(3);
//        LeaveTypePage.click_ok_Button();
        LeaveTypePage.clickCancelButtonClick();
        extentTest.log(LogStatus.PASS, " library management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test( groups = "REGRESSION",priority = 4, dataProvider = "TestData", dataProviderClass = LeaveTestDatas.class)

    public void specialcharaterLeaveTypeTest(String txttype){
        softAssert = new SoftAssert();
        extentTest=extentReport.startTest("EmptyLeaveType");
        DashboardPage.clickManageLeaveMenu();
        LOGGER.info("DashBoardPage is menu CLick");
        DashboardPage.clickManageLeaveTypeSubMenu();
        LOGGER.info("DashBoardPage is Submenu Leave type CLick");
        LeaveTypePage.clickAddButtonClick();
        LeaveTypePage.setLeaveType(txttype);
        LOGGER.info("Enter The specialcharater");
        LeaveTypePage.clickSaveButtonClick();
        LeaveTypePage.implicitWait(3);
//        LeaveTypePage.click_ok_Button();
        LeaveTypePage.clickCancelButtonClick();
        extentTest.log(LogStatus.PASS, " library management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    @Test( groups = "REGRESSION",priority = 4, dataProvider = "TestData", dataProviderClass = LeaveTestDatas.class)
    public void XcelLeaveTypeTest(String txttype){

//        softAssert = new SoftAssert();
//        extentTest=extentReport.startTest("LeaveTestData");
        DashboardPage.clickManageLeaveMenu();
        LOGGER.info("DashBoardPage is menu CLick");
        DashboardPage.clickManageLeaveTypeSubMenu();
        LOGGER.info("DashBoardPage is Submenu Leave type CLick");
        LeaveTypePage.clickAddButtonClick();
        LeaveTypePage.setLeaveType(txttype);
        LOGGER.info("Enter The specialcharater");
        LeaveTypePage.clickSaveButtonClick();
//        LeaveTypePage.implicitWait(3);
////        LeaveTypePage.click_ok_Button();
//        LeaveTypePage.clickCancelButtonClick();
//        extentTest.log(LogStatus.PASS, " library management system : ");
//        extentReport.endTest(extentTest);
//        softAssert.assertAll();
    }

}
