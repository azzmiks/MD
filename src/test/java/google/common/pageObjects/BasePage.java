package google.common.pageObjects;

import org.openqa.selenium.WebDriver;

/**
 * Created by azmiks on 26/04/2017.
 */
public abstract class BasePage {

    private WebDriver webDriver;

    public BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public abstract boolean isLoaded();

    public BasePage loadPage(String url) {
        webDriver.get(url);
        return this;
    }
}
