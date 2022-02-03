package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {

    static WebDriver driver;

    public static void createDriver(){
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//test//resources//driver//chromedriver.exe");
        // Open the browser
        driver = new ChromeDriver();
        // 1. To open url in browser
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver(){
        return driver;
    }


}
