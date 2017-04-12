package google.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
/**
 * Created by azmiks on 11/04/2017.
 */
public class GoToGooglePage {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
    }
    //@BeforeMethod - what is the analog of it in JUnit
    public void openHomePage() {
        driver.get("http://www.google.com");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test(){
    //TODO
    }

}
