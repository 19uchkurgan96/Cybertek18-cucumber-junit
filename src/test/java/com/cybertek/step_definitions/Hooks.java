package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    @Before(order = 2)
    public void setUpScenario(){
        System.out.println("-----> Before annotation : Setting up browser");
    }
    @Before(value= "@db", order=1)
    public void setUpDatabaseConnection(){
        System.out.println("------>Before annotation : DB connection created<-----");
    }

    @After(order = 1)
    public void tearDownScenario(){
        System.out.println("-----> After annotation : Closing browser");
    }
    @After(value = "@db", order=2)
    public void tearDownScenarioConnection (){
        System.out.println("----->After annotation : Closing browser");
    }
    @BeforeStep
    public void setUpStep(){
        System.out.println("==========> BEFORESTEP: TAKING SCREENSHOT<===========");
    }
    @AfterStep(order=1)
    public void tearDownStep(Scenario scenario) {
        // System.out.println( "===========> AFTERSTEP: TAKING SCREENSHOT<==========");
        //  System.out.println("scenario.getName() = " + scenario.getName());
        //  System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());
        //  System.out.println("scenario.isFailed() = " + scenario.isFailed());

        if (scenario.isFailed()) {
// # 1. we need to take a screenshot using ->SELENIUM
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
// # 2. we are going to attach it into our report
            // attach method accepts 3 arguments: 1)->screenshot, 2)->image type, 3)->current scenarios names
            scenario.attach(screenshot, "image/png", scenario.getName());

        }
    }



}
