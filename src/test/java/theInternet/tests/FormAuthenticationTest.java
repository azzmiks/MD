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
public class FormAuthenticationTest extends BaseTest {


    private String url;
    private PageObjectTheInternetManager manager;

    public FormAuthenticationTest() {
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
    public void shouldLoginAndLogoutOK() {
        manager.getMainPage().loadPage(url);
        assertThat(manager.getMainPage().isLoaded()).isTrue();
        manager.getMainPage().clickOnFormAuthenticationLink();
        assertThat(manager.getFormAuthenticationPage().isLoaded()).isTrue();
        manager.getFormAuthenticationPage().enterUsername("tomsmith");
        manager.getFormAuthenticationPage().enterPassword("SuperSecretPassword!");
        manager.getFormAuthenticationPage().clickLoginButton();
        assertThat(manager.getFormAuthenticationPage().isLoginSuccessful()).isTrue();
        manager.getFormAuthenticationPage().clickLogoutButton();
        assertThat(manager.getFormAuthenticationPage().isLogoutSuccessful()).isTrue();
    }
}
