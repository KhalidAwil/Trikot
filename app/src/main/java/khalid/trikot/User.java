package khalid.trikot;

/**
 * User class - Stores user information
 */
public class User {
    private String userName;
    private String phoneNumber;
    private String path;

    public User(){
        //Empty constructor
    }

    public User(String userName, String email){
        this.userName = userName;
        this.path = email.replace("." ,".");
    }

    public User(String userName, String email, String phoneNumber){
        this.userName = userName;
        this.path = email.replace("." ,".");
        this.phoneNumber = phoneNumber;
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
