package SignUpLogin;

public class UserType {

    private String email, password,firstname,lastname, usertype;

    public String getFirstname() {
        return firstname;
    }
    public void newFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getlastname() {
        return lastname;
    }
    public String getEmail() {
        return email;
    }
    public void newEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void newPassword(String password) {
        this.password = password;
    }
    public String getUsertype() {
        return usertype;
    }
    public void newUsertype(String usertype) {
        this.usertype = usertype;
    }
    public UserType(String firstname,String lastname,String email, String password, String usertype) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.usertype = usertype;

    }
}

