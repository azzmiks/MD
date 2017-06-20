package theInternet.pages;

import common.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.net.URISyntaxException;

/**
 * Created by Myroslava_Zubach on 20.06.2017.
 */
public class FileUploadPage extends BasePage {

    @FindBy (id = "file-upload")
    private WebElement fileUploadController;

    @FindBy (id = "file-submit")
    private WebElement uploadButton;

    private String fileUploadConfirmation = "//div[@id='uploaded-files' and contains(text(), '%s')]";

    public FileUploadPage(WebDriver webDriver) {
        super(webDriver);
    }

    public FileUploadPage uploadFile(String filePath) throws URISyntaxException {
        File f = new File(filePath);
        System.out.println(f.getAbsoluteFile());
        fileUploadController.sendKeys(f.getAbsolutePath());
        return this;
    }

    public FileUploadPage clickUpload() {
        uploadButton.click();
        return this;
    }

 //   public boolean isFileUploaded(String fileName) {
        //example with element Changed in DOM after upload (element is not existing until DOM reload)
//       return customWait.isElementPresented(By.xpath(String.format(fileUploadConfirmation, fileName)));
//   }

    @Override
    public boolean isLoaded() {
        return customWait.isElementPresent(fileUploadController);
    }
}