package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyUserCanLogin() {
        loginPage.doLogin();
        homePage.verifyPage();
    }

}
