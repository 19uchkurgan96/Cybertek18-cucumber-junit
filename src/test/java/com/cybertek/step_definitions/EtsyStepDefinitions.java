package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class EtsyStepDefinitions {

    @Given("User is on the Etsy home page")
    public void User_is_on_the_Etsy_home_page(){
    Driver.getDriver().get("https://www.etsy.com");
    }

    @Then("User should see title is as expected")
    public void user_should_see_title_is_as_expected(){
    String actualTitle = Driver.getDriver().getTitle();
    String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
