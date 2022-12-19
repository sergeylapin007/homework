package desktop.pages;

import abstractclasses.page.AbstractPage;
import desktop.fragments.NavigationBar;
import driver.SingletonDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {

    @FindBy (id = "ap_email")
    private WebElement emailField;

    @FindBy (id = "ap_password")
    private WebElement passwordField;

    @FindBy (id = "signInSubmit")
    private WebElement signInButton;

    @FindBy (xpath = "//div[@class='user-nav-wrap ']")
    private NavigationBar navigationBar;


    public LoginPage(String url) {
        setPageUrl(url);
        PageFactory.initElements(SingletonDriver.getWebDriverInstance(),this);
    }

}
