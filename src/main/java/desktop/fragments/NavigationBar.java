package desktop.fragments;

import abstractclasses.fragment.AbstractFragment;
import driver.SingletonDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar extends AbstractFragment {

    @FindBy (xpath = "//div[@class='user-nav']//a[text()='Contact us']")
    private WebElement contactUsButton;

    @FindBy (xpath = "//div[@class='user-nav']//a[text()='Help']")
    private WebElement helpButton;

    public NavigationBar() {
        PageFactory.initElements(SingletonDriver.getWebDriverInstance(),this);
    }
}
