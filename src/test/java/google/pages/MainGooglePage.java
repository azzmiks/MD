package google.pages;

import common.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Myroslava_Zubach on 19.06.2017.
 */
public class MainGooglePage extends BasePage {

    @FindBy(xpath = ".//a[contains(text(), 'Sign in')]")
    private WebElement signInButton;

    public MainGooglePage(WebDriver webDriver) {
        super(webDriver);
    }

    public MainGooglePage signInButtonClick() {
        signInButton.click();
        return this;
    }

    @Override
    public boolean isLoaded() {
        return customWait.isElementPresent(signInButton);
    }
}
