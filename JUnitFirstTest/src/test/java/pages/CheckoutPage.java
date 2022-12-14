package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage extends BaseObjectPage {

    @FindBy(id = "onepage-customer-name")
    public WebElement nameField;

    @FindBy(id = "onepage-customer-telephone")
    public WebElement phoneField;

    @FindBy(id = "onepage-customer-email")
    public WebElement emailField;

    @FindBy(id = "select-city")
    public WebElement cityDropdown;

    @FindBy(css = "ul.custom_select_list li:last-child")
    public WebElement customCityOptionInCityDropdown;

    @FindBy(id = "city")
    public WebElement inputCityField;

    @FindBy(css = "ul.onepage_tabs li:first-child")
    public WebElement newUserTab;

    @FindBy(css = "p.onepage_product_new_price")
    public WebElement productPrice;

    @FindBy(css = "span.mini_cart_sum_price")
    public WebElement totalPrice;

    @FindBy(id = "second-step-button")
    public WebElement selectDeliveryButton;


    public CheckoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void fillContactInformation(String name,String phone,String email,String city) {
        nameField.sendKeys(name);
        phoneField.sendKeys(phone);
        emailField.sendKeys(email);
        cityDropdown.click();
        customCityOptionInCityDropdown.click();
        new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("city")));
        inputCityField.sendKeys(city);
        newUserTab.click();
    }

    public String getProductPrice(){
        return productPrice.getText();
    }

    public String getTotalPrice(){
        return totalPrice.getText();
    }

    public void openDeliverySection(){
        selectDeliveryButton.click();
    }
}
