package heranca_classe_normal;

public class Student  extends User {
    double adminId;
    public Student(double adminId){
        super("Marcos", "marcosstudent@gmail.com", "student123", "STUDENT");
        this.adminId = adminId;
    }
    public void signUp() {
        double id = this.id;
        String nome = this.nome;
        String email = this.email;
        String password = this.password;
        String role = this.role;
        double adminId = this.adminId;

        System.out.println("Conta criada para: " + nome + " ID " + id + " Email: " + email + " Senha: " + password + " Role: " + role + " adminId: " + adminId);
    }
}
