package theInternet.pages;

import common.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Myroslava_Zubach on 17.05.2017.
 */
public class CheckboxesPage extends BasePage {

    @FindBy (xpath = "//h3[contains(text(), 'Checkboxes')]")
    private WebElement checkboxesHeader;

//    @FindBy (xpath = "//input[contains(text(), 'checkbox 1')]")
    @FindBy (xpath = "//input[1]")
    private WebElement checkbox1;

//    @FindBy (xpath = "//input[contains(text(), 'checkbox 2')]")
    @FindBy (xpath ="//input[2]")
    private WebElement checkbox2;

    public CheckboxesPage (WebDriver webDriver) {
        super(webDriver);
    }

    public CheckboxesPage clickOnChecbox1() {
        checkbox1.click();
        return this;
    }

    public CheckboxesPage clickOnChecbox2() {
        checkbox2.click();
        return this;
    }

    @Override
    public boolean isLoaded() {
        return customWait.isElementVisible(checkboxesHeader);
    }

    public boolean isCheckbox1Checked() {
        return checkbox1.isSelected();
    }

    public boolean isCheckbox2Checked() {
        return checkbox2.isSelected();
    }
}
