package theInternet.pages;

import common.pageObjects.BasePage;
import common.utils.CustomWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by azmiks on 15/05/2017.
 */
public class BasicAuthPage extends BasePage {

    @FindBy (xpath = "//*[@id=\"content\"]/div/p")
    private WebElement basicAuthTextCongrats;

    public BasicAuthPage (WebDriver webDriver) {
        super(webDriver);
        customWait = new CustomWait(webDriver);
    }

    @Override
    public boolean isLoaded() {
        return customWait.isElementVisible(basicAuthTextCongrats);
    }
}
