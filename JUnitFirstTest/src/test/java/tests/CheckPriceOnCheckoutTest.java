package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.*;

public class CheckPriceOnCheckoutTest extends BaseTestCase {

    @Test
    public void CheckPriceOnCheckout () throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        ProductListingPage listingPage = homePage.searchProduct("Iphone 12");
        ProductDetailPage detailPage = listingPage.clickOnTheFirstProduct();
        BeforeBasketPopup popup = detailPage.clickAddToBasketButton();
        CheckoutPage checkoutPage = popup.createOrder();
        checkoutPage.fillContactInformation("Serhii","993701818","Serhii_Lapin@epam.com","Соледар");
        checkoutPage.openDeliverySection();
        String actualProductPrice = checkoutPage.getProductPrice();
        String actualTotalPrice = checkoutPage.getTotalPrice();
        Assert.assertEquals("31 999 ₴",actualProductPrice);
        Assert.assertEquals("31 999 ₴",actualTotalPrice);
    }
}
