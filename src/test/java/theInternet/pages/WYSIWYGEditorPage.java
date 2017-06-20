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

    private static final String FRAME_NAME = "mce_0_ifr";

    @FindBy(xpath = "//h3[contains(text(), 'An iFrame containing the TinyMCE WYSIWYG Editor')]")
    private WebElement wysiwygEditorHeader;

    @FindBy(xpath = "//p[contains(text(),'Your content goes here.')]")
    private WebElement frameContent;

    @FindBy(xpath = "//p[contains(text(),'Test Automation training is awesome!')]")
    private WebElement text;

    @FindBy(xpath = "//body[@id='tinymce']")
    private WebElement textField;

    @FindBy(xpath = "//i[@class='mce-caret']")
    private WebElement buttonFileMenu;

    @FindBy(xpath = "//span[@class='mce-text']")
    private WebElement newDocument;

    @FindBy(xpath = "//i[@class='mce-ico mce-i-bold']")
    private WebElement buttonBold;

    @FindBy(xpath = "//i[@class='mce-ico mce-i-italic']")
    private WebElement buttonItalic;

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

    public WYSIWYGEditorPage clickOnFileMenu() {
        buttonFileMenu.click();
        newDocument.click();
        return this;
    }

    public WYSIWYGEditorPage clickBold() {
        buttonBold.click();
        return this;
    }

    public WYSIWYGEditorPage clickItalic() {
        buttonItalic.click();
        return this;
    }

    public WYSIWYGEditorPage enterText(String text) {
        textField.click();
        textField.sendKeys(text);
        return this;
    }

    @Override
    public boolean isLoaded() {
        return customWait.isElementPresent(wysiwygEditorHeader);
    }

    public boolean isFrameContentPresent(){
        return customWait.isElementPresent(frameContent);
    }

    public boolean isTextPresentInFrame() {
        return customWait.isElementPresent(text);
    }
}
