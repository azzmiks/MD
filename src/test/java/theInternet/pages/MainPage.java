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

    @FindBy (xpath = "//a[@href='/login']")
    private WebElement formAuthentication;

    @FindBy (xpath = "//a[@href='/checkboxes']")
    private WebElement checkboxes;

    @FindBy (xpath = "//a[@href='/dropdown']")
    private WebElement dropdown;

    @FindBy(xpath = "//a[contains(text(), 'File Upload')]")
    private WebElement fileUploadLink;

    @FindBy(xpath = "//a[contains(text(), 'Drag and Drop')]")
    private WebElement dragAndDropLink;

    private String basicAuthUrl = "https://admin:admin@the-internet.herokuapp.com/basic_auth";

    private CustomWait customWait;

    public MainPage (WebDriver webDriver) {
        super(webDriver);
        customWait = new CustomWait(webDriver);
    }

    public MainPage clickOnABTestingLink() {
        abTest.click();
        return this;
    }

    public MainPage openBasicAuthLink() {
        webDriver.get(basicAuthUrl);
        return this;
    }

    public MainPage clickOnFormAuthenticationLink() {
        formAuthentication.click();
        return this;
    }

    public MainPage clickOnCheckBoxesLink() {
        checkboxes.click();
        return this;
    }

    public MainPage clickOnDropdownLink() {
        dropdown.click();
        return this;
    }

    public MainPage clickUploadLink() {
        fileUploadLink.click();
        return this;
    }

    public MainPage clickDragAndDropLink() {
        dragAndDropLink.click();
        return this;
    }

    @Override
    public boolean isLoaded() {
        return customWait.isElementPresent(welcomeToTheInternet);
    }



}
