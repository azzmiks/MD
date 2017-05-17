package theInternet.pages;

import common.utils.CustomWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Myroslava_Zubach on 17.05.2017.
 */
public class CheckboxesPage extends MainPage {

    @FindBy (xpath = "//h3[contains(text(), 'Checkboxes')]")
    private WebElement checkboxesHeader;

//    @FindBy (xpath = "//input[contains(text(), 'checkbox 1')]")
    @FindBy (xpath = "//input[1]")
    private WebElement checkbox1;

//    @FindBy (xpath = "//input[contains(text(), 'checkbox 2')]")
    @FindBy (xpath ="//input[2]")
    private WebElement checkbox2;

    @FindBy (xpath = "(//input[@checked])[1]")
    private WebElement checkbox1Checked;

    @FindBy (xpath = "(//input[@checked])[2]")
    private WebElement checkbox2Checked;

    private CustomWait customWait;

    public CheckboxesPage (WebDriver webDriver) {
        super(webDriver);
        customWait = new CustomWait(webDriver);
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
        return customWait.isElementPresent(checkboxesHeader);
    }

    public boolean isCheckbox1Checked() {
        return customWait.isElementPresent(checkbox1Checked);
    }

    public boolean isCheckbox2Checked() {
        return customWait.isElementPresent(checkbox2Checked);
    }
}
