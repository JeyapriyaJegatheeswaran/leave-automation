package com.sgic.automation.leaveSystem.pages;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class UserRolePage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(DashboardPage.class);

    private static By hdrUserRolePage = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/section/div/div[1]/h3");
    private static By addRoleBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/section/div/div[1]/button");

//AddRolePopup
    private static By roleNameField = By.xpath("//*[@id=\"exampleForm.ControlTextarea1\"]");
    private static By addRoleSaveBtn= By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    private static By addRoleCancelBtn = By.xpath("/html/body/div[3]/div/div/div[3]/button[1]");
    private static By addedRole = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/section/div/div[2]/table/tbody/tr/td[1]");



    public static boolean isUserRolePageDisplay() {

        return getDriver().findElement(hdrUserRolePage).isDisplayed();
    }
    public static boolean isAddedRoleDisplay() {

        return getDriver().findElement(addedRole).isDisplayed();
    }
    public static void clickAddRoleButton() {
        getDriver().findElement(addRoleBtn).click();
    }
    public static void sentRoleName() {
        getDriver().findElement(roleNameField).sendKeys("jeyapriya");
    }
    public static void clickAddRoleSaveButton() {
        getDriver().findElement(addRoleSaveBtn).click();
    }
}
