package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductListingPage extends BaseObjectPage{

    @FindBy (css = "div.products-layout__container div:first-child")
    public WebElement firstProductOnProductListingPage;

    public ProductListingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public ProductDetailPage clickOnTheFirstProduct(){
        firstProductOnProductListingPage.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("products"));
        return new ProductDetailPage(driver);
    }
}
