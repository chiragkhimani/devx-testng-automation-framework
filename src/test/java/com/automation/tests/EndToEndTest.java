package com.automation.tests;

import org.testng.annotations.Test;

public class EndToEndTest extends BaseTest {

    @Test
    public void verifyUserCanPlaceOrder() {
        loginPage.doLogin();
        homePage.verifyHomePage();
        homePage.clickOnItem();
        productDetailsPage.verifyProductDetailPage();
        productDetailsPage.clickOnAddToCartBtn();
        productDetailsPage.clickOnCartIcon();
        cartPage.verifyCartPage();
        cartPage.clickOnCheckoutBtn();
        checkoutPage.fillCheckOutDetails();
        checkoutPage.clickOnContinueBtn();
        reviewPage.verifyReviewPage();
        reviewPage.clickOnFinishBtn();
        orderConfirmationPage.verifyOrderConfirmationPage();
    }


}
