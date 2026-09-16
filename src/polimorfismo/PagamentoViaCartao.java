package polimorfismo;

public class PagamentoViaCartao extends Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagando R$: " + valor + " via cartão");
    }
}
