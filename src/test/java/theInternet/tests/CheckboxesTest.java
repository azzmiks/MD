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
public class CheckboxesTest extends BaseTest {

    private String url;
    private PageObjectTheInternetManager manager;

    public CheckboxesTest() {
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
    public void shouldClickOnCheckboxes() {
        manager.getMainPage().loadPage(url);
        assertThat(manager.getMainPage().isLoaded()).isTrue();
        manager.getMainPage().clickOnCheckBoxesLink();
        assertThat(manager.getCheckboxesPage().isLoaded()).isTrue();
        assertThat(manager.getCheckboxesPage().isCheckbox1Checked()).isFalse();
        assertThat(manager.getCheckboxesPage().isCheckbox2Checked()).isTrue();
        manager.getCheckboxesPage().clickOnChecbox1();
        manager.getCheckboxesPage().clickOnChecbox2();
        assertThat(manager.getCheckboxesPage().isCheckbox1Checked()).isTrue();
        assertThat(manager.getCheckboxesPage().isCheckbox2Checked()).isFalse();
    }
}
