package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageRozetka {

    private final WebDriver driver;

    @FindBy (xpath = "//img[@alt='Rozetka Logo']")
    private WebElement logo;

    @FindBy (xpath = "//rz-user/button[@class='header__button ng-star-inserted']")
    private WebElement singIn_LogInButton;

    @FindBy (xpath = "//input[@name='search']")
    private  WebElement searchField;

    @FindBy(id = "fat-menu")
    private WebElement mainMenu;

    @FindBy(xpath = "//div[@class='simple-slider__holder']")
    private WebElement promoBanner;

    public HomePageRozetka(WebDriver driver) {
        this.driver = driver;
        driver.get("https://rozetka.com.ua/");
        PageFactory.initElements(driver,this);
    }

    public ProductListingPage searchProduct(String product) throws InterruptedException {
        searchField.sendKeys(product, Keys.ENTER);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//app-buy-button[@goods_id='352490814']/button")));
        return new ProductListingPage(driver);
    }

}

