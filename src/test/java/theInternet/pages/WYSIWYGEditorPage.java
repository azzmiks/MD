package theInternet.pages;

import common.pageObjects.BasePage;
import common.utils.CustomWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Myroslava_Zubach on 20.06.2017.
 */
public class WYSIWYGEditorPage extends BasePage {

    private static final String FRAME_NAME = "iframe#mce_0_ifr";

    @FindBy(xpath = "//h3[contains(text(), 'An iFrame containing the TinyMCE WYSIWYG Editor')]")
    private WebElement wysiwygEditorHeader;

    public WYSIWYGEditorPage (WebDriver webDriver) {
        super(webDriver);
        customWait = new CustomWait(webDriver);
    }

    public WYSIWYGEditorPage switchToEditorFrame() {
        webDriver.switchTo().frame(FRAME_NAME);
        return this;
    }

    public WYSIWYGEditorPage switchToTopFrame() {
        webDriver.switchTo().defaultContent();
        return this;
    }

    @Override
    public boolean isLoaded() {
        return customWait.isElementPresent(wysiwygEditorHeader);
    }
}
