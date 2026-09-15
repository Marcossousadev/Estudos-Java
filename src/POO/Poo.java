package POO;// uma classe é um modelo que defini a estrutura de nossos objetos, a classe ela é por exenplo um molde de bolo
// A classe é um conjunto de características e comportamentos que definem um grupo de objetos pertencentes a ela.
// caracterìsticas sendo atributos
// comportamentos sendo métodos

// o que é um constructor?
// ele é um método especial de uma classe, pois ele será chamado toda vez quando um objeto dessa classe for criado


// P00
public class Poo {
    public static void main( String[] args ) {
        // toda vez que um novo carro for criado, o método construtor dessa classe vai ser chamado
        Car meuCarro1 = new Car("Fusca"); // tipo Car, uma classe também representa um tipo, não sendo mais um tipo primitivo
        Car meuCarro2 = new Car("Sandero");
        Car meuCarro3 = new Car("BMW");
        // cada um desses objetos é uma instância da classe Car
        String result = meuCarro1.acelerar();
        meuCarro2.acelerar();

        meuCarro3.acelerar();

        System.out.println(result);
    }
}

class Car {
    // pra que serve o método construtor?
    // ele serve para quando estivermos criado esse objeto, agente consiga atribuir valores aos atributos desse objeto
    // e pra que a gente consiga moldar algumas dependências internas do próprio objeto
    String modelo; // atributo
    public Car( String modelo) {
        this.modelo = modelo; // usamos this pois estamos acessando a instância atual desse carro;
    }
    // PRIMEIRO DECLARAMOS O MODIFICADOR DE ACESSO
    // DEPOIS QUAL O VALOR QUE ELE RETORNA
    // SE O MÉTODO NÃO RETORNA NADA, USAMOS VOID, JÁ SE ELE RETORNA, INFORMAMOS O VALOR
    public String acelerar() {
        System.out.println("Acelerando " + this.modelo);
        return "vrummm";
    }
}
