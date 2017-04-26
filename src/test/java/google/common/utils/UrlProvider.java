package google.common.utils;

/**
 * Created by azmiks on 26/04/2017.
 */
public enum UrlProvider {
    GOOGLE_MAIN("https://www.google.com/en"),

    private final String baseUrl;

    private UrlProvider(String baseUrl) {

        this.baseUrl = baseUrl;
    }

    public String getUrl() {

        return baseUrl;
    }
}
