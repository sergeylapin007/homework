package com.cucumber.junit.steps;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.time.Duration;

import static pages.BaseObjectPage.driver;

public class steps {

    HomePage homePage = new HomePage(driver);
    ProductListingPage productListingPage = new ProductListingPage(driver);
    ProductDetailPage productDetailPage = new ProductDetailPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);
    BeforeBasketPopup beforeBasketPopup = new BeforeBasketPopup(driver);

    @And("open the page by the link {string}")
    public void openThePageByTheLink(String url) {
        driver.get(url);
    }

    @And("enter {string} text in the Search field")
    public void enterTextInTheSearchField(String text) {
        homePage.searchField.sendKeys(text);
    }

    @And("click on the Search button")
    public void clickOnTheSearchButton() {
        homePage.submitSearchButton.click();
    }

    @And("click on the first product on the product listing page")
    public void clickOnTheFirstProductOnTheProductListingPage() {
        productListingPage.firstProductOnProductListingPage.click();
    }

    @And("click on the Add to basket button")
    public void clickOnTheAddToBasketButton() {
        productDetailPage.buyButton.click();
    }

    @And("click on the Create order button")
    public void clickOnTheCreateOrderButton() {
        beforeBasketPopup.createOrderButton.click();
    }

    @And("^enter \"[A-Za-zА-Яа-я]+\" text in the Name field$")
    public void enterTextInTheNameField(String name) {
        checkoutPage.nameField.sendKeys(name);
    }

    @And("^enter \"[+]?[\\d]{9,12}\" text in the Phone field$")
    public void enterTextInThePhoneField(String phone) {
        checkoutPage.phoneField.sendKeys(phone);
    }

    @And("^enter \"[\\w]+@[a-z]+\\.[a-z]+\" text in the Email field$")
    public void enterTextInTheEmailField(String email) {
        checkoutPage.emailField.sendKeys(email);
    }

    @And("^find the the following city \"[A-Za-zА-Яа-я]+\" in the City dropdown$")
    public void selectValueInTheCityDropdown(String city) {
        checkoutPage.cityDropdown.click();
        checkoutPage.customCityOptionInCityDropdown.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("city")));
        checkoutPage.inputCityField.sendKeys(city);
    }

    @And("click on the Select delivery option button")
    public void clickOnTheSelectDeliveryOptionButton() {
        checkoutPage.selectDeliveryButton.click();
    }

    @And("^total price is equal to \"\\d* \\d* ₴\"$")
    public void totalPriceIsEqualTo(String expectedResult) {
        Assert.assertEquals(expectedResult,checkoutPage.getTotalPrice());
    }

    @And("^wait for \"[1-9]+\" seconds$")
    public void waitForSeconds(int time) throws InterruptedException {
        Thread.sleep(1000L * time);
    }

    @And("^product price is equal to \"\\d* \\d* ₴\"$")
    public void productPriceIsEqualTo(String expectedResult) {
        Assert.assertEquals(expectedResult,checkoutPage.getProductPrice());
    }
}
