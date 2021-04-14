public class MyDatabase {
    private String url;
    private String password;

    public MyDatabase() {
    }

    public String getUrl() {
        return url;
    }

    public MyDatabase setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public MyDatabase setPassword(String password) {
        this.password = password;
        return this;
    }
}
