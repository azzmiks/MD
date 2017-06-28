package google.pages;

import common.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Myroslava_Zubach on 19.06.2017.
 */
public class PasswordGooglePage extends BasePage {

    @FindBy(id = "passwordNext")
    private WebElement passwordNextButton;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(id = "profileIdentifier")
    private WebElement emailDisplayText;

    public PasswordGooglePage(WebDriver webDriver) {
        super(webDriver);
    }

    public PasswordGooglePage nextButtonClick() {
        passwordNextButton.click();
        return this;
    }

    public PasswordGooglePage enterPassword(String password) {
        passwordField.click();
        passwordField.sendKeys(password);
        return this;
    }

    @Override
    public boolean isLoaded() {
        return customWait.isElementVisible(passwordNextButton);
    }

    public String getEmailDisplayed() {
        return customWait.createFluentWait().until((WebDriver ignored) -> emailDisplayText.getText());
    }
}
