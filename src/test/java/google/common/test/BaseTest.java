package google.common.test;

import google.common.utils.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Myroslava_Zubach on 20.04.2017.
 */
public class BaseTest {

    protected WebDriver webDriver;
    protected PageObjectManager manager;

    public BaseTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        webDriver = new ChromeDriver();
        manager = new PageObjectManager(webDriver);
    }
}
