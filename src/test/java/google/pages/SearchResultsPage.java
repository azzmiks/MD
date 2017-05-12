package google.pages;

import google.common.utils.CustomWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by Myroslava_Zubach on 12.04.2017.
 */
public class SearchResultsPage extends HomePage {


    private static Logger logger = LoggerFactory.getLogger(SearchResultsPage.class);

    @FindBy(xpath = "(//h3/a)[3]")
    //@FindBy (xpath = "(//h3/a)[3]")
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

    @Override
    public boolean isLoaded() {
        return customWait.isElementPresent(searchResult);
    }

}
