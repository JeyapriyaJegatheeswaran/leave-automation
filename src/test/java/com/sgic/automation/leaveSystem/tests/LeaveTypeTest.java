package com.sgic.automation.leaveSystem.tests;

import com.sgic.automation.leaveSystem.pages.DashboardPage;
import com.sgic.automation.leaveSystem.pages.LeaveTypePage;
import com.sgic.automation.leaveSystem.utils.Constants;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.log4testng.Logger;

public class LeaveTypeTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(LeaveTypeTest.class);
    @Test
    public void SaveUserTest(){
        softAssert = new SoftAssert();
        DashboardPage.clickManageLeaveMenu();
        LOGGER.info("DashBoardPage is menu CLick");
        DashboardPage.clickManageLeaveTypeSubMenu();
        LOGGER.info("DashBoardPage is Submenu Leave type CLick");
        LeaveTypePage.clickAddButtonClick();
        LeaveTypePage.setLeaveType(Constants.OrgUserName);
        LeaveTypePage.clickSaveButtonClick();
        LeaveTypePage.implicitWait(3);
        LeaveTypePage.click_ok_Button();
        softAssert.assertAll();
    }
}
