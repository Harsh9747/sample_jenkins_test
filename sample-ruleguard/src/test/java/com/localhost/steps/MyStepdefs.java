package com.localhost.steps;

import com.localhost.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I verify logo is present or not$")
    public void iVerifyLogoIsPresentOrNot() {

        new HomePage().iVerifyLogo();
    }

    @And("^I hover mouse on Solutions tab$")
    public void iHoverMouseOnSolutionsTab() {
        new HomePage().iMouseHoverOnSolutionTab();
    }

    @And("^I hover and click on TASKS & CHECKLISTS$")
    public void iClickOnTASKSCHECKLISTS() throws InterruptedException {
        new HomePage().iMouseHoverAndClickOnTaskAndCheckListTab();
    }


    @Then("^I verify the tile of the page \"([^\"]*)\"$")
    public void iVerifyTheTileOfThePage(String title)  {
        Assert.assertEquals("invalid title of the page", title, new HomePage().iVerifyPageTitle());
    }
}
