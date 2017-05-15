package theInternet.pages;

import common.utils.CustomWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by azmiks on 15/05/2017.
 */
public class BasicAuthPage extends MainPage {


    private CustomWait customWait;

    public BasicAuthPage (WebDriver webDriver) {
        super(webDriver);
        customWait = new CustomWait(webDriver);
    }

/*    @Override
    public boolean isLoaded() {

        return customWait.isElementPresent();
    }*/
}
