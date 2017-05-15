package theInternet.tests;

import common.test.BaseTest;
import common.utils.UrlProvider;
import google.pages.HomePage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by azmiks on 15/05/2017.
 */
public class TheInternetTest extends BaseTest {
    private WebDriver webDriver;
    private HomePage homePage;

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
        manager.getMainPage().clickOnBasicAuthLink();
    }
}
