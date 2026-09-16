package interfaces;
// essa classe segue o contrato no qual a interface criou para ele!
// aqui estou implementando os métodos
// quando formos criar uma classe que respeite uma interface, temos que seguir oq foi declarado na interface, seguir seus métodos...
public class JogadorFutebol implements Jogador {
    @Override
    public void jogar() {
        System.out.println("Jogando Futebol...");
    }
    @Override
    public void parar_de_jogar() {
        System.out.println("Parando de jogar Futebol...");
    }
}
