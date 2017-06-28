package theInternet.tests;

import common.test.BaseTest;
import common.utils.PageObjectTheInternetManager;
import common.utils.UrlProvider;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by azmiks on 28/06/2017.
 */
public class DropdownTest extends BaseTest {

    private String url;
    private PageObjectTheInternetManager manager;

    public DropdownTest() {
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
    public void shouldCheckDropdownDefault() {
        manager.getMainPage().loadPage(url);
        assertThat(manager.getMainPage().isLoaded()).isTrue();
        manager.getMainPage().clickOnDropdownLink();
        assertThat(manager.getDropdownPage().isLoaded()).isTrue();
        manager.getDropdownPage().selectOption2FromDropdown();
        assertThat(manager.getDropdownPage().isDropdownSelected()).isEqualToIgnoringCase("Option 2");
        manager.getDropdownPage().selectOption1FromDropdown();
        assertThat(manager.getDropdownPage().isDropdownSelected()).isEqualToIgnoringCase("Option 1");
    }
}
