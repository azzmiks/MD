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
/*
        // Test3: Form Authentication
        manager.getMainPage().clickOnFormAuthenticationLink();
        assertThat(manager.getFormAuthenticationPage().isLoaded()).isTrue();
        manager.getFormAuthenticationPage().enterUsername("tomsmith");
        manager.getFormAuthenticationPage().enterPassword("SuperSecretPassword!");
        manager.getFormAuthenticationPage().clickLoginButton();
        assertThat(manager.getFormAuthenticationPage().isLoginSuccessful()).isTrue();
        manager.getFormAuthenticationPage().clickLogoutButton();
        assertThat(manager.getFormAuthenticationPage().isLogoutSuccessful()).isTrue();
*/
        // Test4: Checkboxes
        manager.getMainPage().clickOnCheckBoxesLink();
        assertThat(manager.getCheckboxesPage().isLoaded()).isTrue();
        manager.getCheckboxesPage().clickOnChecbox1();
        manager.getCheckboxesPage().clickOnChecbox2();
        assertThat(manager.getCheckboxesPage().isCheckbox1Checked()).isTrue();
        assertThat(manager.getCheckboxesPage().isCheckbox2Checked()).isFalse();
    }
}
