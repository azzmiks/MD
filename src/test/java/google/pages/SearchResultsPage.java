package google.pages;

import google.common.pageObjects.BasePage;
import google.common.utils.CustomWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Myroslava_Zubach on 12.04.2017.
 */
public class SearchResultsPage extends HomePage {

    @FindBy (xpath = "//h3[1]/a")
    private WebElement searchResult;

    private CustomWait customWait;

    public SearchResultsPage (WebDriver webDriver) {
        super(webDriver);
        customWait = new CustomWait(webDriver);
    }

    public SearchResultsPage getFirstResultTitle() {
        searchResult.click();
        return this;
    }

    }
