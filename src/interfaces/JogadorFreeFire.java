package interfaces;

public class JogadorFreeFire implements Jogador{
    @Override
    public void jogar() {
        System.out.println("Começando a jogar FreeFire");
    }
    @Override
    public void parar_de_jogar() {
        System.out.println("Parando de jogar FreeFire.");
    }
}
