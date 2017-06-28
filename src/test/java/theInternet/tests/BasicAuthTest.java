package theInternet.tests;

import common.test.BaseTest;
import common.utils.PageObjectTheInternetManager;
import common.utils.UrlProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by azmiks on 28/06/2017.
 */
public class BasicAuthTest extends BaseTest {

    private String url;
    private PageObjectTheInternetManager manager;

    public BasicAuthTest() {
        manager = new PageObjectTheInternetManager(webDriver);
    }

    @BeforeMethod
    private void startUp() {
        url = UrlProvider.THE_INTERNET.getUrl();
    }

    @AfterMethod
    private void tearDown() {
        webDriver.quit();
    }

    @Test
    public void shouldBasicAuthOK() {
        manager.getMainPage().loadPage(url);
        assertThat(manager.getMainPage().isLoaded()).isTrue();
        manager.getMainPage().openBasicAuthLink();
        assertThat(manager.getBasicAuthPage().isLoaded()).isTrue();
    }
}
