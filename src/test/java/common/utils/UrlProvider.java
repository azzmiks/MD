package common.utils;

/**
 * Created by azmiks on 26/04/2017.
 */
public enum UrlProvider {
    GOOGLE_MAIN("https://www.google.com/en"),
    THE_INTERNET("https://the-internet.herokuapp.com/");

    private final String baseUrl;

    UrlProvider(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getUrl() {
        return baseUrl;
    }
}
