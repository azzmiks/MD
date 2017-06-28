package google.pages;

import common.pageObjects.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Myroslava_Zubach on 19.06.2017.
 */
public class LoginGooglePage extends BasePage {

    @FindBy(xpath = ".//input[@id='identifierId']")
    private WebElement emailField;

//  private String email = String.format(".//input[@id='%s']", "identifiedId");
//  private By emailField = By.xpath("");

    @FindBy(id = "identifierNext")
    private WebElement nextButton;

    public LoginGooglePage(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginGooglePage enterMailAddress(String login) {
//      WebElement element = webDriver.findElement(emailField);
//      WebElement element = webDriver.findElement(By.xpath(email)); -- in this case <private By emailField = By.xpath("");> is waste
//      element.click();
//      element.sendKeys(login);

        emailField.click();
        emailField.sendKeys(login);
        return this;
    }

    public LoginGooglePage clickNextButton() {
        nextButton.click();
        return this;
    }

    public LoginGooglePage alternateClickNextButton() {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();", nextButton);
        return this;
    }

    @Override
    public boolean isLoaded() {
        return customWait.isElementVisible(emailField) && customWait.isElementVisible(nextButton);
    }
}
