package com.automation.tests;

import com.automation.pages.*;
import com.automation.utils.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    LoginPage loginPage;
    HomePage homePage;
    ProductDetailsPage productDetailsPage;
    CartPage cartPage;
    ReviewPage reviewPage;
    OrderConfirmationPage orderConfirmationPage;
    CheckoutPage checkoutPage;

    @BeforeMethod
    public void setUp(){
        DriverUtils.createDriver();
        loginPage = new LoginPage();
        homePage = new HomePage();
        checkoutPage = new CheckoutPage();
        reviewPage = new ReviewPage();
        orderConfirmationPage = new OrderConfirmationPage();
        cartPage = new CartPage();
        productDetailsPage = new ProductDetailsPage();
    }

    @AfterMethod
    public void cleanUp(){
        DriverUtils.getDriver().quit();
    }

}
