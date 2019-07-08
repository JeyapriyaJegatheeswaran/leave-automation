package com.sgic.automation.leaveSystem.tests.DesignationTest;

import com.sgic.automation.leaveSystem.pages.DashboardPage;
import com.sgic.automation.leaveSystem.pages.Designation.AddDesignationPage;
import com.sgic.automation.leaveSystem.testData.Designation.AddDesignationData;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;


/**
 * @author Thusya
 */

public class AddDesignationDataTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddDesignationDataTest.class);

@Test(testName = "Add Designation", dataProviderClass = AddDesignationData.class,dataProvider = "AddDesignation")
public void addDesignation(String designation){
    extentTest =extentReport.startTest("Add Designation");
    DashboardPage.clickManageEpmloyeeMenu();
    DashboardPage.implicitWait(4);
    DashboardPage.clickManageDesignationSubMenu();
    AddDesignationPage.Desplay_Designation_Add_Button();
    AddDesignationPage.Click_Add_Designation_Button();
    AddDesignationPage.Click_Add_Designation_Field();
    AddDesignationPage.AddDesignationForm(designation);
    AddDesignationPage.Save_Designation_Button();
    extentReport.endTest(extentTest);


}
}
