package google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Myroslava_Zubach on 12.04.2017.
 */
public class HomePage {

    private static final String GOOGLE_HOME_PAGE_URL = "http://www.google.com";

    @FindBy (css = "#tsf > div.tsf-p > div.jsb > center > input[type=\"submit\"]:nth-child(1)")
    private WebElement searchButton;

    private String test = "#tsf > div.tsf-p > div.jsb > center > input[type=\"%s\"]:nth-child(1)";

    private By by = By.xpath(String.format(test, "submit"));


    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage open() {
        driver.get(GOOGLE_HOME_PAGE_URL);
        driver.findElement(by);
        return this;
    }



}
