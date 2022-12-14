package pages;

import org.openqa.selenium.WebDriver;

public class BaseObjectPage {
    public static WebDriver driver;

    public final String HOMEPAGE_URL = "https://allo.ua/ru/";

    public BaseObjectPage(WebDriver value) {
        driver = value;
    }
}
