package com.sgic.automation.leaveSystem.tests.UserRole;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.leaveSystem.pages.DashboardPage;
import com.sgic.automation.leaveSystem.pages.UserRolePage;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class AddNewRole extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddNewRole.class);
    @Test
    public void first() {
        extentTest=extentReport.startTest("Add userRole");
        softAssert.assertTrue(DashboardPage.isDashboardPageDisplay(),"Dashboard page is not displayed");
        LOGGER.info("Dashboard page is displayed");
        extentTest.log(LogStatus.PASS, "Dashboard page is displayed");
        DashboardPage.clickLanageUserMenu();
        DashboardPage.clickUserRoleSubMenu();
        softAssert.assertTrue(UserRolePage.isUserRolePageDisplay(),"UserRole page is not displayed");
        LOGGER.info("UserRole page is displayed");
        extentTest.log(LogStatus.PASS, "UserRole page is displayed");
        UserRolePage.clickAddRoleButton();
        UserRolePage.sentRoleName();
        UserRolePage.clickAddRoleSaveButton();
        implicitWait(2);
        UserRolePage.isAddedRoleDisplay();
        LOGGER.info("Added data  is displayed");
        extentTest.log(LogStatus.PASS, "Added data  is displayed");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
