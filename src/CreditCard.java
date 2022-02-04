import java.util.Date;

public class CreditCard {
    public String entity;
    private int number;
    private String user;
    private Date expirationDate;
    protected boolean activated;

    public CreditCard() {
    }

    public CreditCard(String entity, int number, String user, Date expirationDate, boolean activated) {
        entity = this.entity;
        number = this.number;
        user = this.user;
        expirationDate = this.expirationDate;
        activated = this.activated;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean getActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
