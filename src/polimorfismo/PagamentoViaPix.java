package polimorfismo;
// interface => implements
// abstract ou classe normal => extends
public class PagamentoViaPix extends Pagamento {
    @Override
    public void pagar(double valor){
        System.out.println("Pagamento de R$: " + valor + " via Pix");
    }
}
