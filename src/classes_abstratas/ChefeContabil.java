package classes_abstratas;

public class ChefeContabil extends Funcionario {
    public ChefeContabil() {
        super("Paulo", 7000);

    }
    @Override
    public double calcular_bonus() {
        System.out.println(this.nome);
        return this.salario * 0.70;
    }
    @Override
    public double soma_salario_mais_bonus(){
        double bonus = calcular_bonus();
        double salario = this.salario;
        double total = salario + calcular_bonus();
        return total;
    }
}
