package common.utils;

import google.pages.MainGooglePage;
import google.pages.LoginGooglePage;
import google.pages.PasswordGooglePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Myroslava_Zubach on 19.06.2017.
 */
public class PageObjectGoogleManager {

    private final WebDriver webDriver;
    private MainGooglePage mainGooglePage;
    private LoginGooglePage loginGooglePage;
    private PasswordGooglePage passwordGooglePage;

    public PageObjectGoogleManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public MainGooglePage mainPage() {
        if (mainGooglePage == null) {
            mainGooglePage = PageFactory.initElements(webDriver, MainGooglePage.class);
        }
        return mainGooglePage;
    }

    public LoginGooglePage loginPage() {
        if (loginGooglePage == null) {
            loginGooglePage = PageFactory.initElements(webDriver, LoginGooglePage.class);
        }
        return loginGooglePage;
    }

    public PasswordGooglePage passwordPage() {
        if (passwordGooglePage == null) {
            passwordGooglePage = PageFactory.initElements(webDriver, PasswordGooglePage.class);
        }
        return passwordGooglePage;
    }
}
