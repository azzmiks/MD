package common.pageObjects;

import common.utils.CustomWait;
import org.openqa.selenium.WebDriver;

/**
 * Created by azmiks on 26/04/2017.
 */
public abstract class BasePage {

    public WebDriver webDriver;
    protected CustomWait customWait;

    public BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
        customWait = new CustomWait(webDriver);
    }

    public abstract boolean isLoaded();

    public BasePage loadPage(String url) {
        webDriver.get(url);
        return this;
    }
}
