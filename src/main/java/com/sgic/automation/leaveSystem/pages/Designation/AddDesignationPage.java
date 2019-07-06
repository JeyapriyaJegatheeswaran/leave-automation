package com.sgic.automation.leaveSystem.pages.Designation;

import com.sgic.automation.leaveSystem.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * @author Thusya
 */

public class AddDesignationPage extends PageBase {

    private static final Logger LOGGER = Logger.getLogger(AddDesignationPage.class);

    private static By Heading_Designation = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/section/div/div[1]/h3");
    private static By designationAdd_btn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/section/div/div[2]/div/div/table/thead/tr/th/button");
    private static By Add_Designation_Field = By.xpath("//*[@id=\"exampleForm.ControlTextarea1\"]");
    private static By Save_Designation_Button = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");


    public static boolean isDesignationPageDisplay(){
        return getDriver().findElement(Heading_Designation).isDisplayed() ;}
    public static boolean Desplay_Designation_Add_Button(){
        return getDriver().findElement(designationAdd_btn).isDisplayed();}
    public static void Click_Add_Designation_Button(){
        implicitWait(10);getDriver().findElement(designationAdd_btn).click();
        LOGGER.info("AddButtonClick");}
    public static void  Click_Add_Designation_Field(){
        getDriver().findElement(Add_Designation_Field).click();
        LOGGER.info("ClickDesignation_Add_Fiend " );}
    public static void Add_Designation_Field(){
        getDriver().findElement(Add_Designation_Field).sendKeys("QA Engineer");
        LOGGER.info("ADDDesignation_Add_Fiend" );}
    public static void Save_Designation_Button(){getDriver().findElement(Save_Designation_Button).click();
        LOGGER.info("Save Designation");}






}
