package com.sgic.automation.leaveSystem.tests.LeaveTypeTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.leaveSystem.pages.DashboardPage;
import com.sgic.automation.leaveSystem.pages.LeaveTypePage;
import com.sgic.automation.leaveSystem.testData.LeaveTestDatas;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LeaveTypeXl extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(LeaveTypeXl.class);
    @Test(dataProviderClass = LeaveTestDatas.class, dataProvider = "TestData")
    public void LeaveType(String type){
        softAssert = new SoftAssert();
        extentTest=extentReport.startTest("XcelTest");
        DashboardPage.clickManageLeaveMenu();
        LOGGER.info("DashBoardPage is menu CLick");
        DashboardPage.clickManageLeaveTypeSubMenu();
        LOGGER.info("DashBoardPage is menu CLick");
        LeaveTypePage.clickAddButtonClick();
        LOGGER.info("Add Button CLick");
        LeaveTypePage.setLeaveType(type);
        LOGGER.info("leave type Send");
        LeaveTypePage.clickSaveButtonClick();
        LOGGER.info("DashBoardPage is Save CLick");
        extentTest.log(LogStatus.PASS, " Leave systems : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }
}
