package theInternet.pages;

import common.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Myroslava_Zubach on 20.06.2017.
 */
public class DragAndDropPage extends BasePage {

    @FindBy (xpath = "//div[@id='column-a']")
    private WebElement boxA;

    @FindBy (xpath = "//div[@id='column-b']")
    private WebElement boxB;

    @FindBy (xpath = "//h3[contains(text(), 'Drag and Drop')]")
    private WebElement dragAndDropPageHeader;

    public DragAndDropPage(WebDriver webDriver) {
        super(webDriver);
    }

    public DragAndDropPage dragElementToDrop() {
        Actions builder = new Actions(webDriver);
        Action dragAndDrop = builder.clickAndHold(boxA)
                .moveToElement(boxB)
                .release(boxB)
                .build();
        dragAndDrop.perform();
        return this;
    }

    @Override
    public boolean isLoaded() {
        return customWait.isElementPresent(dragAndDropPageHeader);
    }
}
