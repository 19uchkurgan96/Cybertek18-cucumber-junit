package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class GoogleStepDefinitions {

    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page(){
        Driver.getDriver().get("https://www.google.com");
    }
 
    @Then("User should see title is Google")
    public void user_should_see_title_is_google(){

     String actualTitle = Driver.getDriver().getTitle();
     String expexctedTitle = "Google";

     Assert.assertTrue("Actual title dose not match expected title!",actualTitle.equals(expexctedTitle));
     Assert.assertEquals("Actual title dose not match expected title!",actualTitle, expexctedTitle);

    }

    @When("User logs in as student")
    public void user_logs_in_as_student() {


    }
    @When("User logs in as admin")
    public void user_logs_in_as_admin() {
    }

    @When("User searches apple")
    public void user_Search_apple(){

        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        // sending value into search box using page object
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title(){

     String expectedTitle = "apple - Google search";
     String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("User should see six links in the footer")
    public void user_should_see_six_links_in_the_footer(List<String > linkString) {

        int expectedSize = linkString.size();



    }


}
