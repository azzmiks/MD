package theInternet.tests;

import common.test.BaseTest;
import common.utils.PageObjectTheInternetManager;
import common.utils.UrlProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URISyntaxException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Myroslava_Zubach on 20.06.2017.
 */
public class FileUploadTest extends BaseTest {

    private String url;
    private PageObjectTheInternetManager manager;

    private static final String NAME_OF_FILE_FOR_UPLOAD = "test.html";
    private static final String PATH_TO_RESOURCE_FOR_UPLOAD = String.format("src/test/resources/%s", NAME_OF_FILE_FOR_UPLOAD);

    public FileUploadTest() {
        manager = new PageObjectTheInternetManager(webDriver);
    }

    @BeforeMethod
    private void startUp() {
        url = UrlProvider.THE_INTERNET.getUrl();
    }

    @AfterMethod
    private void tearDown() {
        webDriver.quit();
    }

    @Test
    public void shouldUploadFile() throws URISyntaxException {
        manager.getMainPage().loadPage(url);
        assertThat(manager.getMainPage().isLoaded()).isTrue();
        manager.getMainPage().clickUploadLink();
        assertThat(manager.getFileUploadPage().isLoaded()).isTrue();
        manager.getFileUploadPage()
                .uploadFile(PATH_TO_RESOURCE_FOR_UPLOAD)
                .clickUpload();
        assertThat(manager.getFileUploadPage().isFileUploaded(PATH_TO_RESOURCE_FOR_UPLOAD)).isTrue();
    }
}
