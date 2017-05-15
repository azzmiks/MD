package theInternet.tests;

import common.test.BaseTest;
import common.utils.UrlProvider;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import theInternet.pages.MainPage;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by azmiks on 15/05/2017.
 */
public class TheInternetTest extends BaseTest {
    private WebDriver webDriver;
    private MainPage mainPage;

    public TheInternetTest(){
        super();
    }

    @After
    public void tearDown() {
        super.webDriver.quit();
    }

    @Test
    public void test(){
        manager.getMainPage().loadPage(UrlProvider.THE_INTERNET.getUrl());

        // Test1. A/B Testing
//        manager.getMainPage().clickOnABTestingLink();
//        manager.getAbTestingPage().checkABTestContent("split testing");

        // Test2: Basic Auth
        //        manager.getMainPage().clickOnBasicAuthLink();

        // Test3: Form Authentication
        manager.getMainPage().clickOnFormAuthentication();
        assertThat(manager.getFormAuthentication().isLoaded()).isTrue();
        manager.getFormAuthentication().enterUsername("tomsmith");
        manager.getFormAuthentication().enterPassword("SuperSecretPassword!");
        manager.getFormAuthentication().clickLoginButton();
        assertThat(manager.getFormAuthentication().isLoginSuccessful()).isTrue();

    }
}
