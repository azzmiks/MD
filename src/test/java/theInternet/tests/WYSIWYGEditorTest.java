package theInternet.tests;

import common.test.BaseTest;
import common.utils.PageObjectTheInternetManager;
import common.utils.UrlProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Myroslava_Zubach on 20.06.2017.
 */
public class WYSIWYGEditorTest extends BaseTest {

    private String url;
    private PageObjectTheInternetManager manager;

    public WYSIWYGEditorTest() {
        manager = new PageObjectTheInternetManager(webDriver);
    }

    @BeforeMethod(enabled = false)
    private void startUp() {
        url = UrlProvider.THE_INTERNET.getUrl();
    }

    @AfterMethod
    private void tearDown() {
        webDriver.quit();
    }

    @Test(enabled = false)
    public void shouldVerifyWYSIWYGEditor() throws InterruptedException {
        manager.getMainPage().loadPage(url);
        assertThat(manager.getMainPage().isLoaded()).isTrue();
        manager.getMainPage().clickWYSIWYGEditorLink();
        assertThat(manager.getWYSIWYGEditorPage().isLoaded()).isTrue();
        manager.getWYSIWYGEditorPage().switchToEditorFrame();
        assertThat(manager.getWYSIWYGEditorPage().isFrameContentPresent()).isTrue();
    }

}
