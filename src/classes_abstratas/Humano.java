package classes_abstratas;

public class Humano  extends SerVivo{
    // não pede para implementar um método que já foi implementado
    // não é obrigado fazer herança apenas com classes abstratas
    // quando eu defino atributos na classe abstrata, eu sou obrigado a defini-los na classe filha
    public int idade;
    public Humano(int idade){
        // primeiro vem o método super
        super("Marcos"); // atributo herdado
        this.idade = idade; // atributo único dessa classe Humano
    }
    @Override
    public void respirar()  {
        // consigo acessar o atributo agora
        System.out.println(idade);
        System.out.println("Inalando e exalando CO2 e Oxigênio...");
    }
}