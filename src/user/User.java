package user;

public class User {
    public String name;
    protected String email;
    protected int password;
    public User(String name, String email, int password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String get_name() {
        return this.name;
    }
    private void set_name(String name) {
        this.name = name;
    }
    public String get_email() {
        return this.email;
    }
    private void set_email(String email) {
        this.email = email;
    }
    protected int get_password() {
        return this.password;
    }
    private void set_password(int password) {
        this.password = password;
    }
}




