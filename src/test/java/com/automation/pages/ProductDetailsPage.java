package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductDetailsPage extends  BasePage{

    @FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    WebElement productTitle;

    @FindBy(xpath = "//img[@class='inventory_details_img']")
    WebElement productImage;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartBtn;

    @FindBy(xpath="//a[@class='shopping_cart_link']")
    WebElement cartLink;

    public void verifyPage() {
        Assert.assertTrue(productTitle.isDisplayed(), "Product Title is missing from pdp page");
        Assert.assertTrue(productImage.isDisplayed(), "Product Image is missing from pdp page");
        Assert.assertEquals(addToCartBtn.isDisplayed(), true, "Add to Cart button is missing from pdp page");
    }

    public void clickOnAddToCartBtn() {
        addToCartBtn.click();
    }

    public void clickOnCartIcon() {
        cartLink.click();
    }
}
