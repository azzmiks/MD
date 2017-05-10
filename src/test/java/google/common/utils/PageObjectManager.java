package google.common.utils;

import google.pages.HomePage;
import google.pages.SearchDetailsPage;
import google.pages.SearchResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
/**
 * Created by Myroslava_Zubach on 20.04.2017.
 */
public class PageObjectManager {

    private final WebDriver webDriver;
    private HomePage homePage;
    private SearchDetailsPage searchDetailsPage;
    private SearchResultsPage searchResultsPage;

    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = PageFactory.initElements(webDriver, HomePage.class);
        }
        return homePage;
    }

    public SearchDetailsPage getSearchDetailsPage() {
        if (searchDetailsPage == null) {
            searchDetailsPage = PageFactory.initElements(webDriver, SearchDetailsPage.class);
        }
        return searchDetailsPage;
    }

    public SearchResultsPage getSearchResultsPage() {
        if (searchResultsPage == null) {
            searchResultsPage = PageFactory.initElements(webDriver, SearchResultsPage.class);
        }
        return searchResultsPage;
    }
}
