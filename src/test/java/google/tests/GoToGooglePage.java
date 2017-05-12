package google.tests;

import google.common.test.BaseTest;
import google.common.utils.UrlProvider;
import google.pages.HomePage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by azmiks on 11/04/2017.
 */
public class GoToGooglePage extends BaseTest {

    private WebDriver webDriver;
    private HomePage homePage;

    public GoToGooglePage(){
        super();
    }

    @After //(alwaysRun = true)
    public void tearDown() {
        super.webDriver.quit();
    }

    @Test
    public void test(){
        manager.getHomePage().loadPage(UrlProvider.GOOGLE_MAIN.getUrl());
        assertThat(manager.getHomePage().isSearchButtonDisplayed()).isTrue();
        manager.getHomePage().enterRequestAndSearch("GitHub");
        assertThat(manager.getSearchResultsPage().isLoaded()).isTrue();
        manager.getSearchResultsPage().getFirstResultTitle();

    }

}
