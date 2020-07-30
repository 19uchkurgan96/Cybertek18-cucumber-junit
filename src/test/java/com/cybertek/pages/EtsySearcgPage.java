package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearcgPage {
    public EtsySearcgPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
@FindBy(name = "search_query")
    public WebElement searchBox;

}
