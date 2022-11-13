package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageRozetka;

import java.time.Duration;

public class HomePageRozetkaTest {

    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    protected void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test (description = "first test")
    public void simpleScenario () throws InterruptedException {
        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        homePageRozetka
                .searchProduct("iphone 14 plus")
                .addProductToBasket()
                .openProductDetailPage();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe("https://rozetka.com.ua/apple-iphone-14-plus-256gb-starlight/p352490814/"));

        Assert.assertEquals(driver.getCurrentUrl(), "https://rozetka.com.ua/apple-iphone-14-plus-256gb-starlight/p352490814/");
    }

    @AfterMethod(alwaysRun = true)
    protected void tearDown(){
        driver.quit();
        driver = null;
    }

}
