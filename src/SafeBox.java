public class SafeBox {
    public String material;
    protected String content;
    private int password;
    private boolean key;

    public SafeBox() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean getKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }
}
