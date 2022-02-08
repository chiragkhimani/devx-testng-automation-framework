package com.automation.tests;

import org.testng.annotations.Test;

public class EndToEndTest extends BaseTest {

    @Test
    public void verifyUserCanPlaceOrder() {
        loginPage.doLogin();
        homePage.verifyPage();
        homePage.clickOnItem();
        productDetailsPage.verifyPage();
        productDetailsPage.clickOnAddToCartBtn();
        productDetailsPage.clickOnCartIcon();
        cartPage.verifyPage();
        cartPage.clickOnCheckoutBtn();
        checkoutPage.verifyPage();
        checkoutPage.fillCheckOutDetails();
        checkoutPage.clickOnContinueBtn();
        reviewPage.verifyPage();
        reviewPage.clickOnFinishBtn();
        orderConfirmationPage.verifyPage();
    }


}
