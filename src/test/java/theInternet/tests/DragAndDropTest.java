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
public class DragAndDropTest extends BaseTest {

    private String url;
    private PageObjectTheInternetManager manager;

    public DragAndDropTest() {
        manager = new PageObjectTheInternetManager(webDriver);
    }

    @BeforeMethod (enabled = false)
    private void startUp() {
        url = UrlProvider.THE_INTERNET.getUrl();
    }

    @AfterMethod
    private void tearDown() {
        webDriver.quit();
    }

    //TODO: does not work [https://github.com/SeleniumHQ/selenium/issues/1365]
    @Test (enabled = false)
    public void shouldDragBoxAAndDropInBoxBPlace() throws InterruptedException {
        manager.getMainPage().loadPage(url);
        assertThat(manager.getMainPage().isLoaded()).isTrue();
        manager.getMainPage().clickDragAndDropLink();
        assertThat(manager.getDragAndDropPage().isLoaded()).isTrue();
        manager.getDragAndDropPage().dragElementToDrop();
    }
}
