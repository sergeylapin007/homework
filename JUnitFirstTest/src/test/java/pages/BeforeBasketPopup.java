package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BeforeBasketPopup extends BaseObjectPage {

    @FindBy(css = "button.order-now")
    public WebElement createOrderButton;
    public BeforeBasketPopup(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public CheckoutPage createOrder (){
        createOrderButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("checkout"));
        return new CheckoutPage(driver);
    }
}
