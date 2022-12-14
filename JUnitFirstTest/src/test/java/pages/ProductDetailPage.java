package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailPage extends BaseObjectPage {

    @FindBy (id = "product-buy-button")
    public WebElement buyButton;

    public ProductDetailPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public BeforeBasketPopup clickAddToBasketButton(){
        buyButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button.order-now")));
        return new BeforeBasketPopup(driver);
    }

}
