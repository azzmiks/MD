package theInternet.pages;

import common.pageObjects.BasePage;
import common.utils.CustomWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by azmiks on 15/05/2017.
 */
public class MainPage extends BasePage {

    @FindBy (xpath = "//h1[@class=\"heading\"]")
    private WebElement welcomeToTheInternet;

    @FindBy (xpath = "//a[@href='/abtest']")
    private WebElement abTest;

    @FindBy (xpath = "//a[@href='/basic_auth']")
    private WebElement basicAuth;

    @FindBy (xpath = "//a[@href='/login']")
    private WebElement formAuthentication;

    private CustomWait customWait;

    public MainPage (WebDriver webDriver) {
        super(webDriver);
        customWait = new CustomWait(webDriver);
    }

    public MainPage clickOnABTestingLink() {
        abTest.click();
        return this;
    }

    public MainPage clickOnBasicAuthLink() {
        basicAuth.click();
        return this;
    }

    public MainPage clickOnFormAuthentication() {
        formAuthentication.click();
        return this;
    }

    @Override
    public boolean isLoaded() {
        return customWait.isElementPresent(welcomeToTheInternet);
    }



}
