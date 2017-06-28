package theInternet.tests;

import common.test.BaseTest;
import common.utils.PageObjectTheInternetManager;
import common.utils.UrlProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
/**
 * Created by Myroslava_Zubach on 28.06.2017.
 */
public class ABTestingTest extends BaseTest {

    private String url;
    private PageObjectTheInternetManager manager;

    public ABTestingTest() {
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
    public void shouldDisplayProperABTestingText(){
        manager.getMainPage().loadPage(url);
        assertThat(manager.getMainPage().isLoaded()).isTrue();
        manager.getMainPage().clickOnABTestingLink();
        manager.getAbTestingPage().checkABTestContent("split testing");
    }
}
