package com.sgic.automation.leaveSystem.tests.LeaveType;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.leaveSystem.pages.DashboardPage;
import com.sgic.automation.leaveSystem.pages.LeaveTypePage;
import com.sgic.automation.leaveSystem.testData.LeaveType.LeaveTypeData;
import com.sgic.automation.leaveSystem.utils.PageBase;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.sgic.automation.leaveSystem.utils.TestBase.extentReport;
import static com.sgic.automation.leaveSystem.utils.TestBase.extentTest;

public class XLeaveTypeTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(XLeaveTypeTest.class);

    @Test(testName = "LeaveType", dataProviderClass = LeaveTypeData.class, dataProvider = "LeaveTypeData")
    public void LeaveType(String type) {
        SoftAssert softAssert = new SoftAssert();

        DashboardPage.clickManageLeaveMenu();
        extentTest=extentReport.startTest("LeaveType");

        DashboardPage.clickManageLeaveTypeSubMenu();
        LOGGER.info("DashBoardPage is menu CLick");
        DashboardPage.clickManageLeaveTypeSubMenu();
        LOGGER.info("DashBoardPage is Submenu Leave type CLick");
        LeaveTypePage.clickAddButtonClick();
        LOGGER.info("AddButton is menu CLick");
        LeaveTypePage.setLeaveType(type);
        LOGGER.info("text Leave type");
        LeaveTypePage.clickSaveButtonClick();
        LOGGER.info("Save Leave Type");
        LeaveTypePage.implicitWait(3);
//        LeaveTypePage.click_ok_Button();
        LeaveTypePage.clickCancelButtonClick();
        extentTest.log(LogStatus.PASS, " library management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}