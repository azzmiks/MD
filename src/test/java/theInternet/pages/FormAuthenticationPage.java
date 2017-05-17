package theInternet.pages;

import common.pageObjects.BasePage;
import common.utils.CustomWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by azmiks on 15/05/2017.
 */
public class FormAuthenticationPage extends BasePage {

    @FindBy (xpath = "//h2[contains(text(), 'Login Page')]")
    private WebElement formAuthHeader;

    @FindBy (xpath = "//input[@name='username']")
    private WebElement userNameField;

    @FindBy (xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy (xpath = "//button")
    private WebElement loginButton;

    @FindBy (xpath = "//div[contains(text(), 'You logged into a secure area')]")
    private WebElement loginSuccess;

    @FindBy (xpath = "//a[@href='/logout']")
    private WebElement logoutButton;

    @FindBy (xpath = "//div[contains(text(), 'You logged out of the secure area')]")
    private WebElement logoutSuccess;

    private CustomWait customWait;

    public FormAuthenticationPage(WebDriver webDriver) {
        super(webDriver);
        customWait = new CustomWait(webDriver);
    }

    public FormAuthenticationPage enterUsername (String username) {
        userNameField.sendKeys(username);
        return this;
    }

    public FormAuthenticationPage enterPassword (String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public FormAuthenticationPage clickLoginButton() {
        loginButton.click();
        return this;
    }

    public FormAuthenticationPage clickLogoutButton() {
        logoutButton.click();
        return this;
    }

    @Override
    public boolean isLoaded() {
        return customWait.isElementPresent(formAuthHeader);
    }

    public boolean isLoginSuccessful() {
        return customWait.isElementPresent(loginSuccess);
    }

    public boolean isLogoutSuccessful() {
        return customWait.isElementPresent(logoutSuccess);
    }
}
