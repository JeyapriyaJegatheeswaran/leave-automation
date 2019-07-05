package com.sgic.automation.leaveSystem.pages;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

/**
 * @Author Jeyapriya
 */
public class DashboardPage extends PageBase {
  public SoftAssert softAssert;

  private static final Logger LOGGER = Logger.getLogger(DashboardPage.class);

  private static By hdrDashboard = By.xpath("//*[@id=\"root\"]/div/header/nav/a[2]");
  private static By dashboardMenu = By.xpath("//*[@id=\"sidebar\"]/ul/li[1]");
  private static By profiledMenu = By.xpath("//*[@id=\"sidebar\"]/ul/li[2]");
  private static By leaveMenu = By.xpath("//*[@id=\"sidebar\"]/ul/li[3]");
  private static By manageEpmloyeeMenu = By.xpath("//*[@id=\"sidebar\"]/ul/li[4]");
  private static By manageLeaveMenu = By.xpath("//*[@id=\"sidebar\"]/ul/li[5]");
  private static By manageUserMenu = By.xpath("//*[@id=\"sidebar\"]/ul/li[6]");
  private static By settingMenu = By.xpath("//*[@id=\"sidebar\"]/ul/li[7]");


  public static void clickDashboardMenu() {
   getDriver().findElement(dashboardMenu).click();
  }
  public static void clickProfiledMenu() {
    getDriver().findElement(profiledMenu).click();
  }
  public static void clickLeaveMenu() {
    getDriver().findElement(leaveMenu).click();
  }
  public static void clickManageEpmloyeeMenu() {
    getDriver().findElement(manageEpmloyeeMenu).click();
  }
  public static void clickManageLeaveMenu() {
    getDriver().findElement(manageLeaveMenu).click();
  }
  public static void clickLanageUserMenu() {
    getDriver().findElement(manageUserMenu).click();
  }
  public static void clickSettingMenu() {
    getDriver().findElement(settingMenu).click();
  }

//  public static boolean isLoginPageDisplay() {
//
//    return getDriver().findElement(hdrLogin).isDisplayed();
//  }
//
//  public static void setUserName(String userName) {
//
//    getDriver().findElement(txtUserName).sendKeys(userName);
//  }
//
//  public static void setPassword(String password) {
//    getDriver().findElement(txtPassword).sendKeys(password);
//  }
//
//  public static void clickLogin() {
//    getDriver().findElement(btnLogin).click();
//  }
//
//  public static boolean isLoginAlertDisplay() {
//    return getDriver().findElement(alert).isDisplayed();
//  }
//
//  public static String getLoginAlert() {
//    return  getDriver().findElement(alert).getText();
//  }




  }



