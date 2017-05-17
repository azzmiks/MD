package theInternet.pages;

import common.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Myroslava_Zubach on 17.05.2017.
 */
public class DropdownPage extends BasePage {


    @FindBy (xpath = "//select[@id='dropdown']")
    private WebElement dropdown;

    @FindBy (xpath = "//select[@id='dropdown']/option[@value=2]")
    private WebElement option2;

    public DropdownPage(WebDriver webDriver) {
        super(webDriver);
    }

    public DropdownPage selectOption2FromDropdown() {
        dropdown.click();
        option2.click();
        return this;
    }

    public boolean isDropdownSelected() {
        Select select = new Select(dropdown).getFirstSelectedOption();
        return !dropdown.isSelected();
    }

    @Override
    public boolean isLoaded() {
        return customWait.isElementPresent(dropdown);
    }
}