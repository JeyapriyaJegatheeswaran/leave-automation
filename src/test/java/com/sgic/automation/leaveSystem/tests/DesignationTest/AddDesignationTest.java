package com.sgic.automation.leaveSystem.tests.DesignationTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.leaveSystem.pages.DashboardPage;
import com.sgic.automation.leaveSystem.pages.Designation.AddDesignationPage;
import com.sgic.automation.leaveSystem.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;


/**
 * @author Thusya
 */

public class AddDesignationTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddDesignationTest.class);

@Test
public void addDesignation(){

    DashboardPage.clickManageEpmloyeeMenu();
    DashboardPage.implicitWait(4);
    DashboardPage.clickManageDesignationSubMenu();
    AddDesignationPage.Desplay_Designation_Add_Button();
    //LOGGER.info("DesignationPageDisplay " );
    AddDesignationPage.Click_Add_Designation_Button();
    AddDesignationPage.Click_Add_Designation_Field();
    AddDesignationPage.Add_Designation_Field();
    AddDesignationPage.Save_Designation_Button();



}
}
