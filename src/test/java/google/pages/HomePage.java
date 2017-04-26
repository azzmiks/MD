package google.pages;

import google.common.pageObjects.BasePage;
import google.common.utils.CustomWait;
import google.components.SearchField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Myroslava_Zubach on 12.04.2017.
 */
public class HomePage extends BasePage {

    @FindBy (id = "lst-ib")
    private WebElement searchField;

    @FindBy (name = "btnK")
    private WebElement searchButton;

    private CustomWait customWait;

    public HomePage (WebDriver webDriver) {
        super(webDriver);
        customWait = new CustomWait(webDriver);
    }

    public HomePage enterRequest(String request) {
        searchField.sendKeys(request);
        return this;
    }

    public HomePage searchButtonClick() {
        searchButton.click();
        return this;
    }

    @Override
    public boolean isLoaded() {
        return customWait.isElementPresent(searchField);
    }

}
