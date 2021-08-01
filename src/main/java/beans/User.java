package beans;

public class User {

    private int id;
    private String userName;
    private String userEmail;
    private String userCountry;

    public User(String userName, String userEmail, String userCountry) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userCountry = userCountry;
    }

    public User(int id, String userName, String userEmail, String userCountry) {
        this.id = id;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userCountry = userCountry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

}
