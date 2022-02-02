package com.automation.tests;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void userCanLogoutFromApp() {

        loginPage.doLogin();

        homePage.verifyHomePage();

        homePage.clickOnBurgerMenu();

        homePage.clickOnLogoutLink();

        loginPage.verifyLoginPage();

    }


}
