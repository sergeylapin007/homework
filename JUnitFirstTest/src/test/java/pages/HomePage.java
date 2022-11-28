package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BaseObjectPage {

    @FindBy (name = "search")
    private WebElement searchField;

    @FindBy (css = "button.search-form__submit-button")
    private WebElement submitSearchButton;


    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void openHomePage(){
        driver.get(HOMEPAGE_URL);
    }

    public ProductListingPage searchProduct(String string) {
        searchField.sendKeys(string);
        submitSearchButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("catalogsearch"));
        return new ProductListingPage(driver);
    }

}

