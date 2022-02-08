package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ReviewPage extends  BasePage{

    @FindBy(xpath = "//div[text()='Payment Information:']/following-sibling::div[@class='summary_value_label'][1]")
    WebElement paymentInfo;

    @FindBy(xpath="//div[@class='inventory_item_name']")
    WebElement itemName;

    @FindBy(id="finish")
    WebElement finishBtn;


    public void verifyReviewPage() {
        Assert.assertTrue(paymentInfo.isDisplayed(), "Payment info is missing from review page");
        Assert.assertTrue(itemName.isDisplayed(), "item name is missing from cart review page");
        Assert.assertEquals(finishBtn.isDisplayed(), true, "Finish button is missing from review page");
    }

    public void clickOnFinishBtn() {
        finishBtn.click();
    }
}
