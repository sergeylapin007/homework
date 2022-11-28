package pages;

import org.openqa.selenium.WebDriver;

public class BaseObjectPage {
    protected final WebDriver driver;

    protected final String HOMEPAGE_URL = "https://allo.ua/ru/";

    public BaseObjectPage(WebDriver driver) {
        this.driver = driver;
    }
}
