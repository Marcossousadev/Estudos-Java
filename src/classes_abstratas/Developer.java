package classes_abstratas;

public class Developer extends Funcionario {
    public Developer() {
        super("Marcos", 5000.50);
    }
    @Override
    public double calcular_bonus() {
        System.out.println(this.nome);
        return this.salario * 0.50;
    }

   @Override
   public double soma_salario_mais_bonus() {
        double bonus = calcular_bonus();
        double total = this.salario + bonus;
        return total;
   }
}
