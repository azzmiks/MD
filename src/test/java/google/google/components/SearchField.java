package google.google.components;

import google.pages.SearchResultsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/**
 * Created by Myroslava_Zubach on 12.04.2017.
 */
public class SearchField {

    private static final By SEARCH_FIELD = By.id("fkbx-text");
    private WebDriver driver;

    public SearchField(WebDriver driver) {
        this.driver = driver;
    }

    public SearchResultsPage searchFor(String value) {
        driver.findElement(SEARCH_FIELD).sendKeys(value + Keys.ENTER);
        return new SearchResultsPage(driver);
    }

}
