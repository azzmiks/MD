package google.tests;

import common.test.BaseTest;
import google.pages.HomePage;
import org.junit.After;
import org.openqa.selenium.WebDriver;

/**
 * Created by azmiks on 11/04/2017.
 */
public class GoToGooglePage extends BaseTest {

    private WebDriver webDriver;
    private HomePage homePage;

//    private PageObjectManager manager;
    public GoToGooglePage(){

        super();
    }

    @After
    public void tearDown() {

        super.webDriver.quit();
    }

//    @Test
//    public void test(){
//        manager.getHomePage().loadPage(UrlProvider.GOOGLE_MAIN.getUrl());
//        assertThat(manager.getHomePage().isSearchButtonDisplayed()).isTrue();
//        manager.getHomePage().enterRequestAndSearch("GitHub");
//        assertThat(manager.getSearchResultsPage().isLoaded()).isTrue();
//        manager.getSearchResultsPage().getFirstResultTitle();
//
//    }

}
