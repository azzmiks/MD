package google.tests;

import google.pages.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by azmiks on 11/04/2017.
 */
public class GoToGooglePage {

    private WebDriver driver;
    private HomePage homePage;

    @BeforeClass //(alwaysRun = true)
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    //@BeforeMethod - what is the analog of it in JUnit
    public void openHomePage() {
        homePage = new HomePage(driver).open();
    }

    @AfterClass //(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test(){

    }

}
