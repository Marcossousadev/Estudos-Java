package polimorfismo;

public class Polimorfismo {
    // o que é polimorfismo?
    // é o conceito que permite que uma única interface, como um método ou uma classe, seja usada para representar
    // diferentes tipos de ações ou objetos
    // poli = diferentes
    //morfismo = formas
    // objetos do mesmo tipo, que possuem o mesmo contratinho (interface), só que se comportam de formas diferentes

    // cada umas das energias, a energia solar, eólica vai ter sua forma de gerar energia, unicamente dela
    // mas ambas usam uma mesma interface
    // objetos do mesmo tipo, e sendo chamandos os mesmos métodos, podem ter comportamentos distintos

    public static void main(String[] args ) {
        Pagamento pagamentoPix = new PagamentoViaPix();
        Pagamento pagamentoCartao = new PagamentoViaCartao();

        // aqui vamos entender o conceito de polimorfismo
        // ambas a classe usam a mesma classe abstrata, utilizam o mesmo método, mas em ambas a implementações de
        // pagamentos são diferentes, mas ambas utiliza o mesmo contrato, a classe abstrata, mas suas regras de
        // processamento de pagamento são completamente diferentes.
        pagamentoPix.pagar(10.50);
        pagamentoCartao.pagar(9.50);
    }
}
