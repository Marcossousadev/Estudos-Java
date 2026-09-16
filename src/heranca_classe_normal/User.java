package heranca_classe_normal;

public class User {
    double id;
    public String nome;
    protected String email;
    protected String password ;
    protected String role;
    public User(String nome, String email, String password, String role) {
        this.id = Math.random();
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Boolean signIn(String email, String password) {
         if(this.email == email && this.password == password) {
             return true;
         }
         else {
             return false;
         }
    }
}
