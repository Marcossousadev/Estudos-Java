package interfaces;

public class Sandeiro implements Carroo {

    @Override // usa esse Overrida para sobescrever o que vem da minha interface
    public void acelerar() {
        System.out.println("Acelerando a 50 por hora");
    }

    @Override
    public void freiar() {
        System.out.println("Freiando.");
    }

    @Override
    public void parar() {
        System.out.println("Parando.");
    }
}
