package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductListingPage {

    private WebDriver driver;

    //'Add to basket' button for test product
    @FindBy (xpath = "//app-buy-button[@goods_id='352490814']/button")
    private WebElement addToBasketButton;

    //Product tile of the test product
    @FindBy (xpath = "//div[@data-goods-id='352490814']")
    private WebElement productTile;

    public ProductListingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public ProductListingPage addProductToBasket() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//app-buy-button[@goods_id='352490814']/button")));
        addToBasketButton.click();
        return this;
    }

    public ProductListingPage openProductDetailPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-goods-id='352490814']")));
        productTile.click();
        return this;
    }

}
