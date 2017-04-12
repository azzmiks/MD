package google.tests;

import google.pages.HomePage;
import org.junit.After;
import org.junit.Before;
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

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    //@BeforeMethod - what is the analog of it in JUnit
    public void openHomePage() {
        homePage = new HomePage(driver).open();
    }

    @After //(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test(){

    }

}
