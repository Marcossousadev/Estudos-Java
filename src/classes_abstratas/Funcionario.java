package classes_abstratas;
// tanto definir método com implementação, como sem implementação
public abstract class Funcionario {
    public double id;
    public String nome;
    public double salario;

    public Funcionario( String nome, double salario ){
        this.id = Math.random();
        this.nome = nome;
        this.salario = salario;
    }
    // modificador de acesso => abstract => oq retorna ou não => nome_var();
    public abstract double calcular_bonus();

    public abstract double soma_salario_mais_bonus();
    // método já com implementação
    public void falar() {
        System.out.println("Oiii...");
    }
}
