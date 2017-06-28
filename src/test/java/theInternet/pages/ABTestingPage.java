package theInternet.pages;

import common.pageObjects.BasePage;
import common.utils.CustomWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by azmiks on 15/05/2017.
 */
public class ABTestingPage extends BasePage {

    @FindBy (xpath = "//h3[contains(text(), 'A/B Test Variation 1')]")
    private WebElement abTestHeader;

    @FindBy (xpath = "//p")
    private WebElement abTestContent;

    public ABTestingPage (WebDriver webDriver) {
        super(webDriver);
        customWait = new CustomWait(webDriver);
    }

    public ABTestingPage checkABTestContent(String phrase) {
        abTestContent.getText().contains(phrase);
        return this;
    }

    @Override
    public boolean isLoaded() {
        return customWait.isElementVisible(abTestHeader);
    }
}
