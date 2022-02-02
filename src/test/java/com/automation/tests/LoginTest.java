package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void verifyUserCanLogin(){
        WebElement userNameEle = driver.findElement(By.id("user-name"));
        WebElement passwordEle = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));

        userNameEle.sendKeys("standard_user");
        passwordEle.sendKeys("secret_sauce");
        loginBtn.click();

        WebElement homePageLogo = driver.findElement(By.className("app_logo"));
        WebElement homePageTitle = driver.findElement(By.cssSelector(".title"));

        Assert.assertTrue(homePageLogo.isDisplayed(), "Logo is missing from homepage");
        Assert.assertTrue(homePageTitle.isDisplayed(), "Title is missing from homepage");
    }

}
