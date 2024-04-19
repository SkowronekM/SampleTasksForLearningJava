public interface Browser {
    static final String ENGINE = "WebKit";

    default String getEngine() {
        return Browser.ENGINE;
    }

    public void goToPage(String url);
    public void refreshPage();
    public void bookmarkPage();
}
