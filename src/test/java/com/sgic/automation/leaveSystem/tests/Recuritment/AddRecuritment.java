package com.sgic.automation.leaveSystem.tests.Recuritment;


import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.leaveSystem.pages.DashboardPage;

import com.sgic.automation.leaveSystem.pages.RecruitmentTypePage;
import com.sgic.automation.leaveSystem.testData.recruitment.AddRecruitment;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AddRecuritment extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddRecuritment.class);

    @Test(dataProviderClass = AddRecruitment.class,dataProvider = "AddRecruitment")
    public void addRecruitementType(String recruitmentType) {
        extentTest=extentReport.startTest("Add Recruitment Type ");
        softAssert = new SoftAssert();
        DashboardPage.clickManageEpmloyeeMenu();
        LOGGER.info("Manage yyyMenu Clicked");
        extentTest.log(LogStatus.PASS,"Manage Recuritment Sub Menu Clicked");
        DashboardPage.clickManageRecuritmentSubMenu();
        RecruitmentTypePage.AddRecruitmentData(recruitmentType);
        extentTest.log(LogStatus.PASS, "Add Recruitment type isn't added");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
        }

        @Test()
        public void addEmptyRecruitementType() {
            extentTest=extentReport.startTest("Add Empty Recruitement Type");
            softAssert = new SoftAssert();
            DashboardPage.clickManageEpmloyeeMenu();
            LOGGER.info("Manage Employee Menu Clicked");
            extentTest.log(LogStatus.PASS,"Manage Employee Menu Clicked");
            DashboardPage.clickManageRecuritmentSubMenu();
            LOGGER.info("Manage Recuritment Sub Menu Clicked");
            extentTest.log(LogStatus.PASS,"Manage Recuritment Sub Menu Clicked");
            RecruitmentTypePage.AddEmptyRecruitmentData();
            extentTest.log(LogStatus.PASS, "Add Empty Recruitement Type isn't saved");
            extentReport.endTest(extentTest);
            softAssert.assertAll();
        }

    @Test()
    public void addAlreadyExistRecruitementType() {
        extentTest=extentReport.startTest("Add Already Exist Recruitement Type");
        softAssert = new SoftAssert();
        DashboardPage.clickManageEpmloyeeMenu();
        LOGGER.info("Manage Employee Menu Clicked");
        DashboardPage.clickManageRecuritmentSubMenu();
        LOGGER.info("Manage Recuritment Sub Menu Clicked");
        RecruitmentTypePage.AddAlreadyExistRecruitmentData();
        extentTest.log(LogStatus.PASS, "Add Already Exist Recruitement type isn't saved");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
        }
}
