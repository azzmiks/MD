package common.utils;

import theInternet.pages.DragAndDropPage;
import theInternet.pages.FileUploadPage;
import theInternet.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import theInternet.pages.WYSIWYGEditorPage;


/**
 * Created by Myroslava_Zubach on 20.06.2017.
 */
public class PageObjectTheInternetManager {
    private final WebDriver webDriver;
    private MainPage mainPage;
    private FileUploadPage fileUploadPage;
    private DragAndDropPage dragAndDropPage;
    private WYSIWYGEditorPage wysiwygEditorPage;

    public PageObjectTheInternetManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public MainPage getMainPage() {
        if (mainPage == null) {
            mainPage = PageFactory.initElements(webDriver, MainPage.class);
        }
        return mainPage;
    }

    public FileUploadPage getFileUploadPage() {
        if (fileUploadPage == null) {
            fileUploadPage = PageFactory.initElements(webDriver, FileUploadPage.class);
        }
        return fileUploadPage;
    }

    public DragAndDropPage getDragAndDropPage() {
        if (dragAndDropPage == null) {
            dragAndDropPage = PageFactory.initElements(webDriver, DragAndDropPage.class);
        }
        return dragAndDropPage;
    }

    public WYSIWYGEditorPage getWYSIWYGEditorPage() {
        if (wysiwygEditorPage == null) {
            wysiwygEditorPage = PageFactory.initElements(webDriver, WYSIWYGEditorPage.class);
        }
        return wysiwygEditorPage;
    }
}
