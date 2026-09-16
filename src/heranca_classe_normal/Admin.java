package heranca_classe_normal;

public class Admin extends User {
    public Admin() {
        // super sempre primeiro
        super("Admin", "adminjava@gmail.com", "javaebom", "ADMIN");
    }

    public void signUp() {
        double id = this.id;
        String nome = this.nome;
        String email = this.email;
        String password = this.password;
        String role = this.role;

    System.out.println("Conta criada para: " + nome + " id: " + id + " Email: " + email + " Senha: " + password + " Role: " + role);
    }
}
