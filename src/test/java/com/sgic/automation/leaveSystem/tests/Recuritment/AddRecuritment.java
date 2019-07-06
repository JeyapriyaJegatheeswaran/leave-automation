package com.sgic.automation.leaveSystem.tests.Recuritment;


import com.sgic.automation.leaveSystem.pages.DashboardPage;
import com.sgic.automation.leaveSystem.pages.RecruitmentTypePage;
import com.sgic.automation.leaveSystem.testData.recruitment.AddRecruitment;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.testng.annotations.Test;

public class AddRecuritment extends TestBase {

    @Test(dataProviderClass = AddRecruitment.class,dataProvider = "AddRecruitment")
    public void addRecruitementType(String recruitmentType) {
        DashboardPage.clickManageEpmloyeeMenu();
        DashboardPage.clickManageRecuritmentSubMenu();
        RecruitmentTypePage.AddRecruitmentData(recruitmentType);
    }
        @Test()
        public void addEmptyRecruitementType() {
            DashboardPage.clickManageEpmloyeeMenu();
            DashboardPage.clickManageRecuritmentSubMenu();
            RecruitmentTypePage.AddEmptyRecruitmentData();
        }
    @Test()
    public void addAlreadyExistRecruitementType() {
        DashboardPage.clickManageEpmloyeeMenu();
        DashboardPage.clickManageRecuritmentSubMenu();
        RecruitmentTypePage.AddAlreadyExistRecruitmentData();
    }
}
