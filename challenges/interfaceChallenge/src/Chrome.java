public class Chrome implements Browser {
    protected String url;

    @Override
    public String getEngine() {
        return ENGINE;
    }

    @Override
    public void goToPage(String url) {
        this.url = url;
        System.out.println("Chrome url: " + url);
    }

    @Override
    public void refreshPage() {

    }

    @Override
    public void bookmarkPage() {

    }
}
