package modificadores;

public class Pneus {
    public Pneus() {
        Carro carro1 = new Carro("golf");
        carro1.acelerar(); // consigo acessá-lo, pois a classe é pública e o método também, public
        carro1.buzinar(); // esse método usa protected, consigo acessá-lo, pois ele está dentro do mesmo pacote, classe public
    }
}
