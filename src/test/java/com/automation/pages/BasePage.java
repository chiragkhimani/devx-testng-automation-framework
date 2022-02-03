package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    WebDriver driver;

    BasePage(){
        this.driver = DriverUtils.getDriver();
        PageFactory.initElements(driver, this);
    }

}
