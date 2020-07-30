package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearcgPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiStepDefinitions {

WikiSearcgPage wikiSearcgPage = new WikiSearcgPage();

    @Given("User is on the Wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {

        Driver.getDriver().get("https://www.wikipedia.org");
    }

    @When("User searches {string} in the wiki search page")
    public void user_searches_in_the_wiki_search_page(String string) {
        wikiSearcgPage.searchBox.sendKeys(string+Keys.ENTER);
    }
    @Then("User should see {string} in the wiki title")
    public void user_should_see_in_the_wiki_title(String expectedInTitle ){
    String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }
   @Then("User should see {string} in the main header")
  public void userShouldSeeInTheMainHeader(String expected){
    String actualHeaderText = wikiSearcgPage.mainHeaderAfterSearch.getText();
    Assert.assertEquals(actualHeaderText, expected);
   }

}
