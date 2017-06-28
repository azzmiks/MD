package theInternet.tests;

import common.test.BaseTest;
import common.utils.PageObjectTheInternetManager;
import common.utils.UrlProvider;
import org.junit.After;
import org.junit.Before;
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
    private PageObjectTheInternetManager manager;

    public TheInternetTest(){
        super();
    }

    @Before
    public void setUp() {
        manager.getMainPage().loadPage(UrlProvider.THE_INTERNET.getUrl());
    }

    @After
    public void tearDown() {
        super.webDriver.quit();
    }

    @Test
    public void shouldDisplayProperABTestingText(){
        manager.getMainPage().clickOnABTestingLink();
        manager.getAbTestingPage().checkABTestContent("split testing");
    }

    @Test
    public void shouldBasicAuthOK() {
         manager.getMainPage().openBasicAuthLink();
         assertThat(manager.getBasicAuthPage().isLoaded()).isTrue();
    }

    @Test
    public void shouldLoginAndLogoutOK() {
        manager.getMainPage().clickOnFormAuthenticationLink();
        assertThat(manager.getFormAuthenticationPage().isLoaded()).isTrue();
        manager.getFormAuthenticationPage().enterUsername("tomsmith");
        manager.getFormAuthenticationPage().enterPassword("SuperSecretPassword!");
        manager.getFormAuthenticationPage().clickLoginButton();
        assertThat(manager.getFormAuthenticationPage().isLoginSuccessful()).isTrue();
        manager.getFormAuthenticationPage().clickLogoutButton();
        assertThat(manager.getFormAuthenticationPage().isLogoutSuccessful()).isTrue();
    }

    @Test
    public void shouldClickOnCheckboxes() {
        // Test4: Checkboxes
        manager.getMainPage().clickOnCheckBoxesLink();
        assertThat(manager.getCheckboxesPage().isLoaded()).isTrue();
        assertThat(manager.getCheckboxesPage().isCheckbox1Checked()).isFalse();
        assertThat(manager.getCheckboxesPage().isCheckbox2Checked()).isTrue();
        manager.getCheckboxesPage().clickOnChecbox1();
        manager.getCheckboxesPage().clickOnChecbox2();
        assertThat(manager.getCheckboxesPage().isCheckbox1Checked()).isTrue();
        assertThat(manager.getCheckboxesPage().isCheckbox2Checked()).isFalse();
    }

    @Test
    public void shouldCheckDropdownDefault() {
        manager.getMainPage().clickOnDropdownLink();
        assertThat(manager.getDropdownPage().isLoaded()).isTrue();
        manager.getDropdownPage().selectOption2FromDropdown();
        assertThat(manager.getDropdownPage().isDropdownSelected()).isEqualToIgnoringCase("Option 2");
        manager.getDropdownPage().selectOption1FromDropdown();
        assertThat(manager.getDropdownPage().isDropdownSelected()).isEqualToIgnoringCase("Option 1");
    }
}
