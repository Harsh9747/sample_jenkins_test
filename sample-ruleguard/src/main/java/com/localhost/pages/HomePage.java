package com.localhost.pages;

import com.localhost.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
Created by : Kaushik Patel
*/
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@data-hook='consent-banner-apply-button']")
    WebElement acceptCookies;


    @CacheLookup
    @FindBy(xpath = "//ul[@class='StylableHorizontalMenu3372578893__menu']/child::li[1]/child::div[1]/descendant::span[1]")
    WebElement solutionsTab;

    @CacheLookup
    @FindBy(xpath = "//span[text()='TASKS & CHECKLISTS']")
    WebElement taskAndChecklist;

    @CacheLookup
    @FindBy(xpath = "//wow-image[@id='img_comp-lby03fgh']")
    WebElement verifyLogo;



    public boolean iVerifyLogo(){
        log.info("I verify logo is present or not : " + verifyLogo.toString());
        boolean result = verifyLogo.isDisplayed();
        return result;
    }

    public void userAcceptsAllCookies() {
        log.info("Clicking on accept all cookies : " + acceptCookies.toString());
        clickOnElement(acceptCookies);
    }

    public void iMouseHoverOnSolutionTab() {
        log.info("Mouse hover on solution tab" + solutionsTab.toString());
        mouseHoverToElement(solutionsTab);

    }

    public void iMouseHoverAndClickOnTaskAndCheckListTab() throws InterruptedException {
        log.info("Mouse hover and click on Task & Checklist tab" + taskAndChecklist.toString());
        Thread.sleep(3000);
        mouseHoverToElementAndClick(taskAndChecklist);
    }

    public String iVerifyPageTitle(){
        log.info("I verify page title" + driver.getTitle().toString());
        String actualText = driver.getTitle();
        return actualText;
    }

}
