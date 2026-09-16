package interfaces;

public class Cb300fs implements Motoo {
    @Override // estou sobresrevendo métodos de uma interface
    public void acelerar() {
        System.out.println("acelerando a 120km/h");
    }
    @Override
    public void freiar() {
        System.out.println("Freiando...");
    }
    @Override
    public void parar() {
        System.out.println("Parando...");
    }
}
