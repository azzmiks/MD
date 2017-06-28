package common.utils;

import theInternet.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Myroslava_Zubach on 20.06.2017.
 */
public class PageObjectTheInternetManager {
    private final WebDriver webDriver;
    private MainPage mainPage;
    private ABTestingPage abTestingPage;
    private BasicAuthPage basicAuthPage;
    private FormAuthenticationPage formAuthenticationPage;
    private CheckboxesPage checkboxesPage;
    private DropdownPage dropdownPage;
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

    public ABTestingPage getAbTestingPage() {
        if (abTestingPage == null) {
            abTestingPage = PageFactory.initElements(webDriver, ABTestingPage.class);
        }
        return abTestingPage;
    }

    public BasicAuthPage getBasicAuthPage() {
        if (basicAuthPage == null) {
            basicAuthPage = PageFactory.initElements(webDriver, BasicAuthPage.class);
        }
        return basicAuthPage;
    }

    public FormAuthenticationPage getFormAuthenticationPage() {
        if (formAuthenticationPage == null) {
            formAuthenticationPage = PageFactory.initElements(webDriver, FormAuthenticationPage.class);
        }
        return formAuthenticationPage;
    }

    public CheckboxesPage getCheckboxesPage() {
        if (checkboxesPage == null) {
            checkboxesPage = PageFactory.initElements(webDriver, CheckboxesPage.class);
        }
        return checkboxesPage;
    }

    public DropdownPage getDropdownPage() {
        if (dropdownPage == null) {
            dropdownPage = PageFactory.initElements(webDriver, DropdownPage.class);
        }
        return dropdownPage;
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
