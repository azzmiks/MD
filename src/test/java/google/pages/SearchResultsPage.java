package google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Myroslava_Zubach on 12.04.2017.
 */
public class SearchResultsPage {

        private By SEARCH_RESULT_ITEM_TITLE = new By.ByXPath("//h3[1]"); //how can I use XPath here?
        private WebDriver driver;

        public SearchResultsPage(WebDriver driver) {
            this.driver = driver;
        }

        public String getFirstResultTitle() {
            return driver.findElement(SEARCH_RESULT_ITEM_TITLE).getText();
        }

        public SearchDetailsPage clickFirstResultTitle() {
            driver.findElement(SEARCH_RESULT_ITEM_TITLE).click();
            return new SearchDetailsPage(driver);
        }

    }
