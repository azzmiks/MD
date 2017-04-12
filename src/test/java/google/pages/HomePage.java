package google.pages;

import org.openqa.selenium.WebDriver;
/**
 * Created by Myroslava_Zubach on 12.04.2017.
 */
public class HomePage {

    private static final String GOOGLE_HOME_PAGE_URL = "http://www.google.com";
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage open() {
        driver.get(GOOGLE_HOME_PAGE_URL);
        return this;
    }

}
