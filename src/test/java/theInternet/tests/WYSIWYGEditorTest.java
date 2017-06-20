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

    @BeforeMethod
    private void startUp() {
        url = UrlProvider.THE_INTERNET.getUrl();
    }

    @AfterMethod
    private void tearDown() {
        webDriver.quit();
    }

    @Test
    public void shouldVerifyWYSIWYGEditor() {
        manager.getMainPage().loadPage(url);
        assertThat(manager.getMainPage().isLoaded()).isTrue();
        manager.getMainPage().clickWYSIWYGEditorLink();
        assertThat(manager.getWYSIWYGEditorPage().isLoaded()).isTrue();
        manager.getWYSIWYGEditorPage().switchToEditorFrame();
        assertThat(manager.getWYSIWYGEditorPage().isFrameContentPresent()).isTrue();
        manager.getWYSIWYGEditorPage().switchToTopFrame();
        manager.getWYSIWYGEditorPage().clickOnFileMenu();
        manager.getWYSIWYGEditorPage().switchToEditorFrame();
        assertThat(manager.getWYSIWYGEditorPage().isFrameContentPresent()).isFalse();
        manager.getWYSIWYGEditorPage().switchToTopFrame();
        manager.getWYSIWYGEditorPage().clickBold();
        manager.getWYSIWYGEditorPage().clickItalic();
        manager.getWYSIWYGEditorPage().switchToEditorFrame();
        manager.getWYSIWYGEditorPage().enterText("Test Automation training is awesome!");
        assertThat(manager.getWYSIWYGEditorPage().isTextPresentInFrame()).isTrue();
    }

}
